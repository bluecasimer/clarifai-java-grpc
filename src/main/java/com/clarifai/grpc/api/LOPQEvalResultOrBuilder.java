// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/resources.proto

package com.clarifai.grpc.api;

public interface LOPQEvalResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:clarifai.api.LOPQEvalResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Rank k for which all metrics are reported.
   * </pre>
   *
   * <code>int32 k = 1;</code>
   */
  int getK();

  /**
   * <pre>
   * Recall &#64; k assuming the brute force search is the ground truth.
   * </pre>
   *
   * <code>float recall_vs_brute_force = 2 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  float getRecallVsBruteForce();

  /**
   * <pre>
   * Kendall's tau correlation &#64; k assuming the brute force search is the ground truth.
   * </pre>
   *
   * <code>float kendall_tau_vs_brute_force = 3 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  float getKendallTauVsBruteForce();

  /**
   * <pre>
   * The percentage of the most frequent code in the indexed part of evaluation data.
   * </pre>
   *
   * <code>float most_frequent_code_percent = 4 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  float getMostFrequentCodePercent();

  /**
   * <pre>
   * Normalized Discounted Cumulative Gain (NDCG) &#64; k with a ground truth inferred from annotations
   * and/or prediction for this evaluation LOPQ model.
   * NDCG uses individual relevance scores of each returned image to evaluate the usefulness, or
   * gain, of a document based on its position in the result list. The premise of DCG is that
   * highly relevant documents appearing lower in a search result list should be penalized as the
   * graded relevance value is reduced logarithmically proportional to the position of the result.
   * See: https://en.wikipedia.org/wiki/Information_retrieval#Discounted_cumulative_gain
   * To compute the relevance score between two images we consider two cases:
   * 1) Only one label for each image
   * An image is relevant to an image query iff they are labeled the same (score 1), and
   * not relevant otherwise (score 0)
   * 2) Multiple labels for each image
   * Here an image relevancy with respect to a single image query is measured by f-beta score
   * assuming the query image list of labels as ground truth and comparing them with that of
   * the search result. These labels can come from image annotations or if substitute_annotation_misses
   * is set, predictions of base classifier where any prediction with prob &lt; prob_threshold are
   * discarded. To quantify the relevancy score of a single search result we opt to compute precision
   * and recall &#64; k for simplicity, and combine them with f-beta score to obtain a single number.
   * </pre>
   *
   * <code>float lopq_ndcg = 5 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  float getLopqNdcg();

  /**
   * <pre>
   * Brute force NDCG which gives a baseline to compare to and is a measure of how good
   * the embeddings are.
   * </pre>
   *
   * <code>float brute_force_ndcg = 6 [(.clarifai.api.utils.cl_show_if_empty) = true];</code>
   */
  float getBruteForceNdcg();
}
