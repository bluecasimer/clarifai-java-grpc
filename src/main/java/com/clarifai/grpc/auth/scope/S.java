// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/auth/scope/scope.proto

package com.clarifai.grpc.auth.scope;

/**
 * <pre>
 * Next index: 41
 * NOTE: When updating the list of "clarifai_exposed" scopes, please also
 * update the TestScopes function in main_key_test.go and TestGetExposedScopes function in
 * scope_test.go
 * The dependencies listed for each scope are simply recommendations so that a user
 * cannot make a key that would be useless. Beyond the key creation they are not enforcee
 * but rather the scopes are enforce when data is accessed.
 * There is the following conventions in place, make sure you add them to the socpes for all new
 * resource types:
 * 1. *_Add required the corresponding _Get.
 * 2. *_Delete requires the corresponding _Add and _Get.
 * 3. *_Patch is deprecated and not check anywhere.
 * </pre>
 *
 * Protobuf enum {@code clarifai.auth.scope.S}
 */
public enum S
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * introduce undef so that the zero (default/unset) value of the enum is not a real
   * permission.  undef is only present for this purpose and should not be used
   * to indicate any "real" value.
   * </pre>
   *
   * <code>undef = 0;</code>
   */
  undef(0),
  /**
   * <code>All = 1 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  All(1),
  /**
   * <pre>
   * Make an rpc to our prediction services.
   * </pre>
   *
   * <code>Predict = 2 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Predict(2),
  /**
   * <code>Predict_Feedback = 29 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Predict_Feedback(29),
  /**
   * <pre>
   * Make an rpc to our search services.
   * </pre>
   *
   * <code>Search = 3 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Search(3),
  /**
   * <code>Search_Feedback = 28 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Search_Feedback(28),
  /**
   * <pre>
   * Write to the inputs table in the DB.
   * </pre>
   *
   * <code>Inputs_Add = 4 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Get];</code>
   */
  Inputs_Add(4),
  /**
   * <pre>
   * Read from the inputs table in the DB.
   * </pre>
   *
   * <code>Inputs_Get = 5 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Inputs_Get(5),
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated.
   * Optionally needs Concepts_Add.
   * </pre>
   *
   * <code>Inputs_Patch = 7 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Get];</code>
   */
  @java.lang.Deprecated
  Inputs_Patch(7),
  /**
   * <pre>
   * To delete we need read/write
   * </pre>
   *
   * <code>Inputs_Delete = 8 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Get];</code>
   */
  Inputs_Delete(8),
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>Outputs_Patch = 9 [deprecated = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Get, (.clarifai.auth.scope.clarifai_depending_scopes) = Predict];</code>
   */
  @java.lang.Deprecated
  Outputs_Patch(9),
  /**
   * <pre>
   * Write to the concepts DB tables.
   * </pre>
   *
   * <code>Concepts_Add = 10 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Get];</code>
   */
  Concepts_Add(10),
  /**
   * <pre>
   * Read from the concepts DB tables.
   * </pre>
   *
   * <code>Concepts_Get = 11 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Concepts_Get(11),
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated
   * </pre>
   *
   * <code>Concepts_Patch = 12 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Get];</code>
   */
  @java.lang.Deprecated
  Concepts_Patch(12),
  /**
   * <pre>
   * To delete we need read/write.
   * Note: not implemented.
   * </pre>
   *
   * <code>Concepts_Delete = 13 [(.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Get];</code>
   */
  Concepts_Delete(13),
  /**
   * <pre>
   * Write to the models DB tables.
   * </pre>
   *
   * <code>Models_Add = 14 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  Models_Add(14),
  /**
   * <pre>
   * Read from the models and models versions DB tables.
   * </pre>
   *
   * <code>Models_Get = 15 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Models_Get(15),
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated.
   * </pre>
   *
   * <code>Models_Patch = 16 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Train];</code>
   */
  @java.lang.Deprecated
  Models_Patch(16),
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Models_Delete = 17 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  Models_Delete(17),
  /**
   * <pre>
   * Note: Models_Train is effectively doing POST /models/{models_id}/versions so it's treated that
   * way in terms of data access under the hood.
   * Write to the model versions DB table.
   * </pre>
   *
   * <code>Models_Train = 26 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  Models_Train(26),
  /**
   * <pre>
   * Internal only model syncing.
   * </pre>
   *
   * <code>Models_Sync = 27 [(.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  Models_Sync(27),
  /**
   * <pre>
   * Note: Models_Deploy is effectively doing POST /models/{models_id}/deployments so it's treated that
   * way in terms of data access under the hood.
   * Write to the model versions DB table.
   * </pre>
   *
   * <code>Models_Deploy = 34 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  Models_Deploy(34),
  /**
   * <pre>
   * Write to the workflows DB table.
   * </pre>
   *
   * <code>Workflows_Add = 18 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Get];</code>
   */
  Workflows_Add(18),
  /**
   * <pre>
   * Read from the workflows DB table.
   * </pre>
   *
   * <code>Workflows_Get = 19 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Workflows_Get(19),
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated.
   * </pre>
   *
   * <code>Workflows_Patch = 20 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Get];</code>
   */
  @java.lang.Deprecated
  Workflows_Patch(20),
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Workflows_Delete = 21 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Get];</code>
   */
  Workflows_Delete(21),
  /**
   * <pre>
   * Write to the visualizations DB table.
   * Deprecated
   * </pre>
   *
   * <code>TSNEVisualizations_Add = 24 [deprecated = true, (.clarifai.auth.scope.clarifai_depending_scopes) = TSNEVisualizations_Get];</code>
   */
  @java.lang.Deprecated
  TSNEVisualizations_Add(24),
  /**
   * <pre>
   * Read from the visualizations DB table.
   * Deprecated
   * </pre>
   *
   * <code>TSNEVisualizations_Get = 25 [deprecated = true];</code>
   */
  @java.lang.Deprecated
  TSNEVisualizations_Get(25),
  /**
   * <pre>
   * Write to the workers DB table.
   * </pre>
   *
   * <code>Workers_Add = 30 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workers_Get];</code>
   */
  Workers_Add(30),
  /**
   * <pre>
   * Read from the workers DB table.
   * </pre>
   *
   * <code>Workers_Get = 31 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Workers_Get(31),
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Workers_Delete = 32 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workers_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Workers_Get];</code>
   */
  Workers_Delete(32),
  /**
   * <pre>
   * Read from the templates DB table.
   * </pre>
   *
   * <code>Templates_Get = 33 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Templates_Get(33),
  /**
   * <pre>
   * Write to the annotations DB table.
   * </pre>
   *
   * <code>Annotations_Add = 37 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Get];</code>
   */
  Annotations_Add(37),
  /**
   * <pre>
   * Read from the annotations DB table.
   * </pre>
   *
   * <code>Annotations_Get = 38 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Annotations_Get(38),
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated.
   * </pre>
   *
   * <code>Annotations_Patch = 39 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Get];</code>
   */
  @java.lang.Deprecated
  Annotations_Patch(39),
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Annotations_Delete = 40 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Get];</code>
   */
  Annotations_Delete(40),
  /**
   * <pre>
   * Write to the collectors DB table.
   * </pre>
   *
   * <code>Collectors_Add = 41 [(.clarifai.auth.scope.clarfai_exposed) = false, (.clarifai.auth.scope.clarifai_depending_scopes) = Collectors_Get];</code>
   */
  Collectors_Add(41),
  /**
   * <pre>
   * Read from the collectors DB table.
   * </pre>
   *
   * <code>Collectors_Get = 42 [(.clarifai.auth.scope.clarfai_exposed) = false];</code>
   */
  Collectors_Get(42),
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Collectors_Delete = 43 [(.clarifai.auth.scope.clarfai_exposed) = false, (.clarifai.auth.scope.clarifai_depending_scopes) = Collectors_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Collectors_Get];</code>
   */
  Collectors_Delete(43),
  /**
   * <pre>
   * Write to the apps DB table.
   * </pre>
   *
   * <code>Apps_Add = 44 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Apps_Get];</code>
   */
  Apps_Add(44),
  /**
   * <pre>
   * Read from the apps DB table.
   * </pre>
   *
   * <code>Apps_Get = 45 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Apps_Get(45),
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Apps_Delete = 46 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Apps_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Apps_Get];</code>
   */
  Apps_Delete(46),
  /**
   * <pre>
   * Write to the keys DB table.
   * </pre>
   *
   * <code>Keys_Add = 47 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Keys_Get];</code>
   */
  Keys_Add(47),
  /**
   * <pre>
   * Read from the keys DB table.
   * </pre>
   *
   * <code>Keys_Get = 48 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  Keys_Get(48),
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Keys_Delete = 49 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Keys_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Keys_Get];</code>
   */
  Keys_Delete(49),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * introduce undef so that the zero (default/unset) value of the enum is not a real
   * permission.  undef is only present for this purpose and should not be used
   * to indicate any "real" value.
   * </pre>
   *
   * <code>undef = 0;</code>
   */
  public static final int undef_VALUE = 0;
  /**
   * <code>All = 1 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int All_VALUE = 1;
  /**
   * <pre>
   * Make an rpc to our prediction services.
   * </pre>
   *
   * <code>Predict = 2 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Predict_VALUE = 2;
  /**
   * <code>Predict_Feedback = 29 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Predict_Feedback_VALUE = 29;
  /**
   * <pre>
   * Make an rpc to our search services.
   * </pre>
   *
   * <code>Search = 3 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Search_VALUE = 3;
  /**
   * <code>Search_Feedback = 28 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Search_Feedback_VALUE = 28;
  /**
   * <pre>
   * Write to the inputs table in the DB.
   * </pre>
   *
   * <code>Inputs_Add = 4 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Get];</code>
   */
  public static final int Inputs_Add_VALUE = 4;
  /**
   * <pre>
   * Read from the inputs table in the DB.
   * </pre>
   *
   * <code>Inputs_Get = 5 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Inputs_Get_VALUE = 5;
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated.
   * Optionally needs Concepts_Add.
   * </pre>
   *
   * <code>Inputs_Patch = 7 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Get];</code>
   */
  public static final int Inputs_Patch_VALUE = 7;
  /**
   * <pre>
   * To delete we need read/write
   * </pre>
   *
   * <code>Inputs_Delete = 8 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Get];</code>
   */
  public static final int Inputs_Delete_VALUE = 8;
  /**
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>Outputs_Patch = 9 [deprecated = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Inputs_Get, (.clarifai.auth.scope.clarifai_depending_scopes) = Predict];</code>
   */
  public static final int Outputs_Patch_VALUE = 9;
  /**
   * <pre>
   * Write to the concepts DB tables.
   * </pre>
   *
   * <code>Concepts_Add = 10 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Get];</code>
   */
  public static final int Concepts_Add_VALUE = 10;
  /**
   * <pre>
   * Read from the concepts DB tables.
   * </pre>
   *
   * <code>Concepts_Get = 11 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Concepts_Get_VALUE = 11;
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated
   * </pre>
   *
   * <code>Concepts_Patch = 12 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Get];</code>
   */
  public static final int Concepts_Patch_VALUE = 12;
  /**
   * <pre>
   * To delete we need read/write.
   * Note: not implemented.
   * </pre>
   *
   * <code>Concepts_Delete = 13 [(.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Concepts_Get];</code>
   */
  public static final int Concepts_Delete_VALUE = 13;
  /**
   * <pre>
   * Write to the models DB tables.
   * </pre>
   *
   * <code>Models_Add = 14 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  public static final int Models_Add_VALUE = 14;
  /**
   * <pre>
   * Read from the models and models versions DB tables.
   * </pre>
   *
   * <code>Models_Get = 15 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Models_Get_VALUE = 15;
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated.
   * </pre>
   *
   * <code>Models_Patch = 16 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Train];</code>
   */
  public static final int Models_Patch_VALUE = 16;
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Models_Delete = 17 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  public static final int Models_Delete_VALUE = 17;
  /**
   * <pre>
   * Note: Models_Train is effectively doing POST /models/{models_id}/versions so it's treated that
   * way in terms of data access under the hood.
   * Write to the model versions DB table.
   * </pre>
   *
   * <code>Models_Train = 26 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  public static final int Models_Train_VALUE = 26;
  /**
   * <pre>
   * Internal only model syncing.
   * </pre>
   *
   * <code>Models_Sync = 27 [(.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  public static final int Models_Sync_VALUE = 27;
  /**
   * <pre>
   * Note: Models_Deploy is effectively doing POST /models/{models_id}/deployments so it's treated that
   * way in terms of data access under the hood.
   * Write to the model versions DB table.
   * </pre>
   *
   * <code>Models_Deploy = 34 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Models_Get];</code>
   */
  public static final int Models_Deploy_VALUE = 34;
  /**
   * <pre>
   * Write to the workflows DB table.
   * </pre>
   *
   * <code>Workflows_Add = 18 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Get];</code>
   */
  public static final int Workflows_Add_VALUE = 18;
  /**
   * <pre>
   * Read from the workflows DB table.
   * </pre>
   *
   * <code>Workflows_Get = 19 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Workflows_Get_VALUE = 19;
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated.
   * </pre>
   *
   * <code>Workflows_Patch = 20 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Get];</code>
   */
  public static final int Workflows_Patch_VALUE = 20;
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Workflows_Delete = 21 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Workflows_Get];</code>
   */
  public static final int Workflows_Delete_VALUE = 21;
  /**
   * <pre>
   * Write to the visualizations DB table.
   * Deprecated
   * </pre>
   *
   * <code>TSNEVisualizations_Add = 24 [deprecated = true, (.clarifai.auth.scope.clarifai_depending_scopes) = TSNEVisualizations_Get];</code>
   */
  public static final int TSNEVisualizations_Add_VALUE = 24;
  /**
   * <pre>
   * Read from the visualizations DB table.
   * Deprecated
   * </pre>
   *
   * <code>TSNEVisualizations_Get = 25 [deprecated = true];</code>
   */
  public static final int TSNEVisualizations_Get_VALUE = 25;
  /**
   * <pre>
   * Write to the workers DB table.
   * </pre>
   *
   * <code>Workers_Add = 30 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workers_Get];</code>
   */
  public static final int Workers_Add_VALUE = 30;
  /**
   * <pre>
   * Read from the workers DB table.
   * </pre>
   *
   * <code>Workers_Get = 31 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Workers_Get_VALUE = 31;
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Workers_Delete = 32 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Workers_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Workers_Get];</code>
   */
  public static final int Workers_Delete_VALUE = 32;
  /**
   * <pre>
   * Read from the templates DB table.
   * </pre>
   *
   * <code>Templates_Get = 33 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Templates_Get_VALUE = 33;
  /**
   * <pre>
   * Write to the annotations DB table.
   * </pre>
   *
   * <code>Annotations_Add = 37 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Get];</code>
   */
  public static final int Annotations_Add_VALUE = 37;
  /**
   * <pre>
   * Read from the annotations DB table.
   * </pre>
   *
   * <code>Annotations_Get = 38 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Annotations_Get_VALUE = 38;
  /**
   * <pre>
   * To patch we need read/write.
   * Deprecated.
   * </pre>
   *
   * <code>Annotations_Patch = 39 [deprecated = true, (.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Get];</code>
   */
  public static final int Annotations_Patch_VALUE = 39;
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Annotations_Delete = 40 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Annotations_Get];</code>
   */
  public static final int Annotations_Delete_VALUE = 40;
  /**
   * <pre>
   * Write to the collectors DB table.
   * </pre>
   *
   * <code>Collectors_Add = 41 [(.clarifai.auth.scope.clarfai_exposed) = false, (.clarifai.auth.scope.clarifai_depending_scopes) = Collectors_Get];</code>
   */
  public static final int Collectors_Add_VALUE = 41;
  /**
   * <pre>
   * Read from the collectors DB table.
   * </pre>
   *
   * <code>Collectors_Get = 42 [(.clarifai.auth.scope.clarfai_exposed) = false];</code>
   */
  public static final int Collectors_Get_VALUE = 42;
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Collectors_Delete = 43 [(.clarifai.auth.scope.clarfai_exposed) = false, (.clarifai.auth.scope.clarifai_depending_scopes) = Collectors_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Collectors_Get];</code>
   */
  public static final int Collectors_Delete_VALUE = 43;
  /**
   * <pre>
   * Write to the apps DB table.
   * </pre>
   *
   * <code>Apps_Add = 44 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Apps_Get];</code>
   */
  public static final int Apps_Add_VALUE = 44;
  /**
   * <pre>
   * Read from the apps DB table.
   * </pre>
   *
   * <code>Apps_Get = 45 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Apps_Get_VALUE = 45;
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Apps_Delete = 46 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Apps_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Apps_Get];</code>
   */
  public static final int Apps_Delete_VALUE = 46;
  /**
   * <pre>
   * Write to the keys DB table.
   * </pre>
   *
   * <code>Keys_Add = 47 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Keys_Get];</code>
   */
  public static final int Keys_Add_VALUE = 47;
  /**
   * <pre>
   * Read from the keys DB table.
   * </pre>
   *
   * <code>Keys_Get = 48 [(.clarifai.auth.scope.clarfai_exposed) = true];</code>
   */
  public static final int Keys_Get_VALUE = 48;
  /**
   * <pre>
   * To delete we need read/write.
   * </pre>
   *
   * <code>Keys_Delete = 49 [(.clarifai.auth.scope.clarfai_exposed) = true, (.clarifai.auth.scope.clarifai_depending_scopes) = Keys_Add, (.clarifai.auth.scope.clarifai_depending_scopes) = Keys_Get];</code>
   */
  public static final int Keys_Delete_VALUE = 49;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static S valueOf(int value) {
    return forNumber(value);
  }

  public static S forNumber(int value) {
    switch (value) {
      case 0: return undef;
      case 1: return All;
      case 2: return Predict;
      case 29: return Predict_Feedback;
      case 3: return Search;
      case 28: return Search_Feedback;
      case 4: return Inputs_Add;
      case 5: return Inputs_Get;
      case 7: return Inputs_Patch;
      case 8: return Inputs_Delete;
      case 9: return Outputs_Patch;
      case 10: return Concepts_Add;
      case 11: return Concepts_Get;
      case 12: return Concepts_Patch;
      case 13: return Concepts_Delete;
      case 14: return Models_Add;
      case 15: return Models_Get;
      case 16: return Models_Patch;
      case 17: return Models_Delete;
      case 26: return Models_Train;
      case 27: return Models_Sync;
      case 34: return Models_Deploy;
      case 18: return Workflows_Add;
      case 19: return Workflows_Get;
      case 20: return Workflows_Patch;
      case 21: return Workflows_Delete;
      case 24: return TSNEVisualizations_Add;
      case 25: return TSNEVisualizations_Get;
      case 30: return Workers_Add;
      case 31: return Workers_Get;
      case 32: return Workers_Delete;
      case 33: return Templates_Get;
      case 37: return Annotations_Add;
      case 38: return Annotations_Get;
      case 39: return Annotations_Patch;
      case 40: return Annotations_Delete;
      case 41: return Collectors_Add;
      case 42: return Collectors_Get;
      case 43: return Collectors_Delete;
      case 44: return Apps_Add;
      case 45: return Apps_Get;
      case 46: return Apps_Delete;
      case 47: return Keys_Add;
      case 48: return Keys_Get;
      case 49: return Keys_Delete;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<S>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      S> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<S>() {
          public S findValueByNumber(int number) {
            return S.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.clarifai.grpc.auth.scope.Scope.getDescriptor().getEnumTypes().get(0);
  }

  private static final S[] VALUES = values();

  public static S valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private S(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:clarifai.auth.scope.S)
}

