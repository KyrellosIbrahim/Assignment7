import networkx as nx
from matplotlib import pyplot as plt


def draw_graph(data):
  G = nx.DiGraph()
  for vertex, distance in data:
    G.add_node(vertex)
    # Find the left and right nodes using the modulo operator
    left_index = (data.index((vertex, distance)) - distance) % len(data)
    right_index = (data.index((vertex, distance)) + distance) % len(data)
    left_vertex = data[left_index][0]
    right_vertex = data[right_index][0]
    G.add_edge(vertex, left_vertex)
    G.add_edge(vertex, right_vertex)

  pos = nx.circular_layout(G)

  nx.draw(G, pos, with_labels=True, node_size=2000, node_color="orange", font_size=20, font_weight="bold", arrowsize=20)

  plt.show()



data = [("I", 2), ("A", 5), ("E", 4), ("F", 1), ("T", 2), ("S", 3)]
draw_graph(data)
