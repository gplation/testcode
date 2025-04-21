package com.example.testcode

/**
 * Represents a node in the graph.
 * @property name The unique identifier for the node.
 */
data class Node(val name: String)

/**
 * Represents a directed edge between two nodes in the graph.
 * @property from The starting node of the edge.
 * @property to The ending node of the edge.
 * @property cost The cost or weight associated with traversing this edge.
 */
data class Edge(val from: Node, val to: Node, val cost: Double) 