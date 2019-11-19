// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/clarifai/api/status/status_code.proto

package com.clarifai.grpc.api.status;

public final class StatusCodeOuterClass {
  private StatusCodeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+proto/clarifai/api/status/status_code." +
      "proto\022\023clarifai.api.status*\3668\n\nStatusCod" +
      "e\022\010\n\004ZERO\020\000\022\014\n\007SUCCESS\020\220N\022\021\n\014MIXED_STATU" +
      "S\020\232N\022\014\n\007FAILURE\020\244N\022\030\n\023CONN_ACCOUNT_ISSUE" +
      "S\020\370U\022\027\n\022CONN_TOKEN_INVALID\020\371U\022\035\n\030CONN_CR" +
      "EDENTIALS_INVALID\020\372U\022\035\n\030CONN_EXCEED_HOUR" +
      "LY_LIMIT\020\373U\022\036\n\031CONN_EXCEED_MONTHLY_LIMIT" +
      "\020\374U\022\023\n\016CONN_THROTTLED\020\375U\022\030\n\023CONN_EXCEEDS" +
      "_LIMITS\020\376U\022\035\n\030CONN_INSUFFICIENT_SCOPES\020\377" +
      "U\022\025\n\020CONN_KEY_INVALID\020\200V\022\027\n\022CONN_KEY_NOT" +
      "_FOUND\020\201V\022\034\n\027CONN_BAD_REQUEST_FORMAT\020\334V\022" +
      "\030\n\023CONN_DOES_NOT_EXIST\020\335V\022\031\n\024CONN_INVALI" +
      "D_REQUEST\020\336V\022\034\n\027CONN_METHOD_NOT_ALLOWED\020" +
      "\337V\022\031\n\024CONN_NO_GDPR_CONSENT\020\340V\022\023\n\rMODEL_T" +
      "RAINED\020\354\244\001\022\024\n\016MODEL_TRAINING\020\355\244\001\022\025\n\017MODE" +
      "L_UNTRAINED\020\356\244\001\022\037\n\031MODEL_QUEUED_FOR_TRAI" +
      "NING\020\357\244\001\022\034\n\026MODEL_TRAINING_NO_DATA\020\366\244\001\022!" +
      "\n\033MODEL_TRAINING_NO_POSITIVES\020\367\244\001\022*\n$MOD" +
      "EL_TRAINING_ONE_VS_N_SINGLE_CLASS\020\370\244\001\022\036\n" +
      "\030MODEL_TRAINING_TIMED_OUT\020\371\244\001\022\"\n\034MODEL_T" +
      "RAINING_WAITING_ERROR\020\372\244\001\022\"\n\034MODEL_TRAIN" +
      "ING_UNKNOWN_ERROR\020\373\244\001\022\"\n\034MODEL_TRAINING_" +
      "MSG_REDELIVER\020\374\244\001\022&\n MODEL_TRAINING_INCO" +
      "NSISTENT_DATA\020\375\244\001\022#\n\035MODEL_TRAINING_INVA" +
      "LID_PARAMS\020\376\244\001\022\032\n\024MODEL_MODIFY_SUCCESS\020\236" +
      "\245\001\022\032\n\024MODEL_MODIFY_PENDING\020\237\245\001\022\031\n\023MODEL_" +
      "MODIFY_FAILED\020\240\245\001\022\032\n\024MODEL_DOES_NOT_EXIS" +
      "T\020\320\245\001\022\035\n\027MODEL_PERMISSION_DENIED\020\321\245\001\022\034\n\026" +
      "MODEL_INVALID_ARGUMENT\020\322\245\001\022\033\n\025MODEL_INVA" +
      "LID_REQUEST\020\323\245\001\022\025\n\017MODEL_EVALUATED\020\264\246\001\022\026" +
      "\n\020MODEL_EVALUATING\020\265\246\001\022\031\n\023MODEL_NOT_EVAL" +
      "UATED\020\266\246\001\022!\n\033MODEL_QUEUED_FOR_EVALUATION" +
      "\020\267\246\001\022 \n\032MODEL_EVALUATION_TIMED_OUT\020\276\246\001\022$" +
      "\n\036MODEL_EVALUATION_WAITING_ERROR\020\277\246\001\022$\n\036" +
      "MODEL_EVALUATION_UNKNOWN_ERROR\020\300\246\001\022\035\n\027MO" +
      "DEL_PREDICTION_FAILED\020\301\246\001\022$\n\036MODEL_EVALU" +
      "ATION_MSG_REDELIVER\020\302\246\001\022\"\n\034MODEL_EVALUAT" +
      "ION_NEED_LABELS\020\303\246\001\022\"\n\034MODEL_EVALUATION_" +
      "NEED_INPUTS\020\304\246\001\022\035\n\027MODEL_DEPLOYMENT_FAIL" +
      "ED\020\346\246\001\022\025\n\017MODEL_DEPLOYING\020\347\246\001\022!\n\033MODEL_Q" +
      "UEUED_FOR_DEPLOYMENT\020\350\246\001\022\030\n\022MODEL_NOT_DE" +
      "PLOYED\020\351\246\001\022 \n\032WORKFLOW_NO_MATCHING_INPUT" +
      "\020\361\253\001\022$\n\036WORKFLOW_REQUIRE_TRAINED_MODEL\020\362" +
      "\253\001\022\030\n\022WORKFLOW_DUPLICATE\020\324\254\001\022!\n\033WORKFLOW" +
      "_UNSUPPORTED_FORMAT\020\325\254\001\022\035\n\027WORKFLOW_DOES" +
      "_NOT_EXIST\020\326\254\001\022 \n\032WORKFLOW_PERMISSION_DE" +
      "NIED\020\327\254\001\022\037\n\031WORKFLOW_INVALID_ARGUMENT\020\330\254" +
      "\001\022\035\n\027WORKFLOW_INVALID_RECIPE\020\331\254\001\022\037\n\031WORK" +
      "FLOW_INVALID_TEMPLATE\020\332\254\001\022\034\n\026WORKFLOW_IN" +
      "VALID_GRAPH\020\333\254\001\022\037\n\031WORKFLOW_INTERNAL_FAI" +
      "LURE\020\334\254\001\022\036\n\030WORKFLOW_INVALID_REQUEST\020\327\263\001" +
      "\022\035\n\027WORKFLOW_MODIFY_SUCCESS\020\206\255\001\022\035\n\027WORKF" +
      "LOW_MODIFY_PENDING\020\207\255\001\022\034\n\026WORKFLOW_MODIF" +
      "Y_FAILED\020\210\255\001\022\035\n\027WORKFLOW_REINDEX_FAILED\020" +
      "\211\255\001\022\034\n\026CONCEPT_MODIFY_SUCCESS\020\356\264\001\022\034\n\026CON" +
      "CEPT_MODIFY_PENDING\020\357\264\001\022\033\n\025CONCEPT_MODIF" +
      "Y_FAILED\020\360\264\001\022\030\n\022ANNOTATION_SUCCESS\020\326\274\001\022\030" +
      "\n\022ANNOTATION_PENDING\020\327\274\001\022\027\n\021ANNOTATION_F" +
      "AILED\020\330\274\001\022\034\n\026ANNOTATION_IN_PROGRESS\020\331\274\001\022" +
      "\037\n\031ANNOTATION_UNKNOWN_STATUS\020\332\274\001\022!\n\033ANNO" +
      "TATION_INVALID_ARGUMENT\020\333\274\001\022\"\n\034ANNOTATIO" +
      "N_PERMISSION_DENIED\020\334\274\001\022\037\n\031ANNOTATION_MO" +
      "DIFY_SUCCESS\020\272\275\001\022\037\n\031ANNOTATION_MODIFY_PE" +
      "NDING\020\273\275\001\022\036\n\030ANNOTATION_MODIFY_FAILED\020\274\275" +
      "\001\022&\n METADATA_INVALID_PATCH_ARGUMENTS\020\304\302" +
      "\001\022\034\n\026METADATA_PARSING_ISSUE\020\305\302\001\022!\n\033METAD" +
      "ATA_MANIPULATION_ISSUE\020\306\302\001\022\034\n\026TRAINER_JO" +
      "B_STATE_NONE\020\250\303\001\022\036\n\030TRAINER_JOB_STATE_QU" +
      "EUED\020\251\303\001\022\037\n\031TRAINER_JOB_STATE_RUNNING\020\252\303" +
      "\001\022 \n\032TRAINER_JOB_STATE_COMPLETE\020\253\303\001\022\035\n\027T" +
      "RAINER_JOB_STATE_ERROR\020\254\303\001\022\027\n\021DATA_DUMP_" +
      "SUCCESS\020\276\304\001\022\027\n\021DATA_DUMP_PENDING\020\277\304\001\022\026\n\020" +
      "DATA_DUMP_FAILED\020\300\304\001\022\033\n\025DATA_DUMP_IN_PRO" +
      "GRESS\020\301\304\001\022\035\n\027APP_DUPLICATION_SUCCESS\020\360\304\001" +
      "\022\034\n\026APP_DUPLICATION_FAILED\020\361\304\001\022\035\n\027APP_DU" +
      "PLICATION_PENDING\020\362\304\001\022!\n\033APP_DUPLICATION" +
      "_IN_PROGRESS\020\363\304\001\022\"\n\034INPUT_IMAGE_DOWNLOAD" +
      "_SUCCESS\020\260\352\001\022\"\n\034INPUT_IMAGE_DOWNLOAD_PEN" +
      "DING\020\261\352\001\022!\n\033INPUT_IMAGE_DOWNLOAD_FAILED\020" +
      "\262\352\001\022&\n INPUT_IMAGE_DOWNLOAD_IN_PROGRESS\020" +
      "\263\352\001\022&\n INPUT_IMAGE_STATUS_UPDATE_FAILED\020" +
      "\264\352\001\022\037\n\031INPUT_IMAGE_DELETE_FAILED\020\265\352\001\022\033\n\025" +
      "INPUT_IMAGE_DUPLICATE\020\224\353\001\022$\n\036INPUT_IMAGE" +
      "_UNSUPPORTED_FORMAT\020\225\353\001\022 \n\032INPUT_IMAGE_D" +
      "OES_NOT_EXIST\020\226\353\001\022#\n\035INPUT_IMAGE_PERMISS" +
      "ION_DENIED\020\227\353\001\022\"\n\034INPUT_IMAGE_INVALID_AR" +
      "GUMENT\020\230\353\001\022\034\n\026INPUT_IMAGE_OVER_LIMIT\020\231\353\001" +
      "\022\035\n\027INPUT_IMAGE_INVALID_URL\020\232\353\001\022 \n\032INPUT" +
      "_IMAGE_MODIFY_SUCCESS\020\370\353\001\022 \n\032INPUT_IMAGE" +
      "_MODIFY_PENDING\020\371\353\001\022\037\n\031INPUT_IMAGE_MODIF" +
      "Y_FAILED\020\373\353\001\022%\n\037INPUT_IMAGE_STORAGE_HOST" +
      "_FAILED\020\202\354\001\022$\n\036ALL_INPUT_IMAGES_INVALID_" +
      "BYTES\020\334\354\001\022!\n\033INPUT_IMAGE_CLUSTER_SUCCESS" +
      "\020\300\355\001\022!\n\033INPUT_IMAGE_CLUSTER_PENDING\020\301\355\001\022" +
      " \n\032INPUT_IMAGE_CLUSTER_FAILED\020\302\355\001\022%\n\037INP" +
      "UT_IMAGE_CLUSTER_IN_PROGRESS\020\303\355\001\022!\n\033INPU" +
      "T_IMAGE_REINDEX_SUCCESS\020\244\356\001\022!\n\033INPUT_IMA" +
      "GE_REINDEX_PENDING\020\245\356\001\022 \n\032INPUT_IMAGE_RE" +
      "INDEX_FAILED\020\246\356\001\022%\n\037INPUT_IMAGE_REINDEX_" +
      "IN_PROGRESS\020\247\356\001\022\"\n\034INPUT_VIDEO_DOWNLOAD_" +
      "SUCCESS\020\230\362\001\022\"\n\034INPUT_VIDEO_DOWNLOAD_PEND" +
      "ING\020\231\362\001\022!\n\033INPUT_VIDEO_DOWNLOAD_FAILED\020\232" +
      "\362\001\022\033\n\025INPUT_VIDEO_DUPLICATE\020\374\362\001\022$\n\036INPUT" +
      "_VIDEO_UNSUPPORTED_FORMAT\020\375\362\001\022 \n\032INPUT_V" +
      "IDEO_DOES_NOT_EXIST\020\376\362\001\022#\n\035INPUT_VIDEO_P" +
      "ERMISSION_DENIED\020\377\362\001\022\"\n\034INPUT_VIDEO_INVA" +
      "LID_ARGUMENT\020\200\363\001\022\034\n\026INPUT_VIDEO_OVER_LIM" +
      "IT\020\201\363\001\022\035\n\027INPUT_VIDEO_INVALID_URL\020\202\363\001\022 \n" +
      "\032INPUT_VIDEO_MODIFY_SUCCESS\020\340\363\001\022 \n\032INPUT" +
      "_VIDEO_MODIFY_PENDING\020\341\363\001\022\037\n\031INPUT_VIDEO" +
      "_MODIFY_FAILED\020\343\363\001\022%\n\037INPUT_VIDEO_STORAG" +
      "E_HOST_FAILED\020\352\363\001\022$\n\036ALL_INPUT_VIDEOS_IN" +
      "VALID_BYTES\020\304\364\001\022\035\n\027INPUT_PERMISSION_DENI" +
      "ED\020\273\270\002\022\035\n\027INPUT_CONNECTION_FAILED\020\274\270\002\022&\n" +
      " REQUEST_DISABLED_FOR_MAINTENANCE\020\275\270\002\022+\n" +
      "%INPUT_WRITES_DISABLED_FOR_MAINTENANCE\020\276" +
      "\270\002\022\033\n\025INPUT_INVALID_REQUEST\020\277\270\002\022\035\n\027PREDI" +
      "CT_INVALID_REQUEST\020\301\270\002\022\034\n\026SEARCH_INVALID" +
      "_REQUEST\020\302\270\002\022\036\n\030CONCEPTS_INVALID_REQUEST" +
      "\020\303\270\002\022\034\n\026DATABASE_DUPLICATE_KEY\020\312\270\002\022 \n\032DA" +
      "TABASE_STATEMENT_TIMEOUT\020\313\270\002\022$\n\036DATABASE" +
      "_INVALID_ROWS_AFFECTED\020\314\270\002\022 \n\032DATABASE_D" +
      "EADLOCK_DETECTED\020\315\270\002\022\030\n\022DATABASE_FAIL_TA" +
      "SK\020\316\270\002\022&\n DATABASE_FAIL_TO_GET_CONNECTIO" +
      "NS\020\317\270\002\022\037\n\031DATABASE_TOO_MANY_CLIENTS\020\320\270\002\022" +
      "\"\n\034DATABASE_CONSTRAINT_VIOLATED\020\321\270\002\022$\n\036D" +
      "ATABASE_NO_ONGOING_OPERATIONS\020\322\270\002\022*\n$DAT" +
      "ABASE_LOCKED_BY_ONGOING_OPERATION\020\323\270\002\022\037\n" +
      "\031ASYNC_WORKER_MULTI_ERRORS\020\324\270\002\022\034\n\026RPC_RE" +
      "QUEST_QUEUE_FULL\020\336\270\002\022\034\n\026RPC_SERVER_UNAVA" +
      "ILABLE\020\337\270\002\022\031\n\023RPC_REQUEST_TIMEOUT\020\340\270\002\022#\n" +
      "\035RPC_MAX_MESSAGE_SIZE_EXCEEDED\020\341\270\002\022\022\n\014RP" +
      "C_CANCELED\020\343\270\002\022\036\n\030CLUSTER_INTERNAL_FAILU" +
      "RE\020\240\320\002\022\037\n\031EXTERNAL_CONNECTION_ERROR\020\342\270\002\022" +
      "\026\n\020QUEUE_CONN_ERROR\020\250\300\002\022!\n\033QUEUE_CLOSE_R" +
      "EQUEST_TIMEOUT\020\252\300\002\022\027\n\021QUEUE_CONN_CLOSED\020" +
      "\253\300\002\022\037\n\031QUEUE_PUBLISH_ACK_TIMEOUT\020\254\300\002\022\031\n\023" +
      "QUEUE_PUBLISH_ERROR\020\255\300\002\022 \n\032QUEUE_SUBSCRI" +
      "PTION_TIMEOUT\020\256\300\002\022\036\n\030QUEUE_SUBSCRIPTION_" +
      "ERROR\020\257\300\002\022\036\n\030QUEUE_MARSHALLING_FAILED\020\260\300" +
      "\002\022 \n\032QUEUE_UNMARSHALLING_FAILED\020\261\300\002\022\'\n!Q" +
      "UEUE_MAX_MSG_REDELIVERY_EXCEEDED\020\262\300\002\022\027\n\021" +
      "QUEUE_ACK_FAILURE\020\263\300\002\022\023\n\rSQS_OVERLIMIT\020\214" +
      "\301\002\022 \n\032SQS_INVALID_RECEIPT_HANDLE\020\215\301\002\022\021\n\013" +
      "SQS_UNKNOWN\020\216\301\002\022\035\n\027SEARCH_INTERNAL_FAILU" +
      "RE\020\371\317\002\022\037\n\031SEARCH_PROJECTION_FAILURE\020\372\317\002\022" +
      "\037\n\031SEARCH_PREDICTION_FAILURE\020\373\317\002\022\'\n!SEAR" +
      "CH_BY_NOT_FULLY_INDEXED_INPUT\020\374\317\002\022 \n\032SAV" +
      "ED_SEARCH_MODIFY_FAILED\020\375\317\002\022\030\n\022STRIPE_EV" +
      "ENT_ERROR\020\341\327\002\022\020\n\nCACHE_MISS\020\311\337\002\022&\n REDIS" +
      "_SCRIPT_EXITED_WITH_FAILURE\020\312\337\002\022\030\n\022SIGNU" +
      "P_EVENT_ERROR\020\261\347\002\022\024\n\016SIGNUP_FLAGGED\020\262\347\002\022" +
      "\032\n\024FILETYPE_UNSUPPORTED\020\263\347\002\022\037\n\031APP_COUNT" +
      "_INVALID_MESSAGE\020\231\357\002\022\'\n!APP_COUNT_UPDATE" +
      "_INCREMENT_FAILED\020\232\357\002\022\036\n\030APP_COUNT_REBUI" +
      "LD_FAILED\020\233\357\002\022 \n\032APP_COUNT_INTERNAL_FAIL" +
      "URE\020\234\357\002\022\027\n\021MP_DOWNLOAD_ERROR\020\375\357\002\022\032\n\024MP_R" +
      "ESOLVE_DNS_ERROR\020\376\357\002\022)\n#MP_DOWNLOAD_MAX_" +
      "SIZE_EXCEEDED_ERROR\020\377\357\002\022\033\n\025MP_IMAGE_DECO" +
      "DE_ERROR\020\200\360\002\022\031\n\023MP_INVALID_ARGUMENT\020\201\360\002\022" +
      "\037\n\031MP_IMAGE_PROCESSING_ERROR\020\202\360\002\022\027\n\021USER" +
      "_CONSENT_FACE\020\321\206\003\022\024\n\016WORKER_MISSING\020\270\216\003\022" +
      "\023\n\rWORKER_ACTIVE\020\271\216\003\022\025\n\017WORKER_INACTIVE\020" +
      "\272\216\003\022\027\n\021COLLECTOR_MISSING\020\240\226\003\022\026\n\020COLLECTO" +
      "R_ACTIVE\020\241\226\003\022\030\n\022COLLECTOR_INACTIVE\020\242\226\003\022\024" +
      "\n\016LICENSE_ACTIVE\020\340\324\003\022\034\n\026LICENSE_DOES_NOT" +
      "_EXIST\020\341\324\003\022\031\n\023LICENSE_NEED_UPDATE\020\342\324\003\022\025\n" +
      "\017LICENSE_EXPIRED\020\343\324\003\022\025\n\017LICENSE_REVOKED\020" +
      "\344\324\003\022\025\n\017LICENSE_DELETED\020\345\324\003\022\035\n\027LICENSE_VO" +
      "LUME_EXCEEDED\020\346\324\003\022\033\n\025INTERNAL_SERVER_ISS" +
      "UE\020\324\375\005\022\035\n\027INTERNAL_FETCHING_ISSUE\020\325\375\005\022\035\n" +
      "\027INTERNAL_DATABASE_ISSUE\020\326\375\005\022!\n\033INTERNAL" +
      "_UNEXPECTED_TIMEOUT\020\331\375\005\022\034\n\026INTERNAL_UNEX" +
      "PECTED_V1\020\332\375\005\022\037\n\031INTERNAL_UNEXPECTED_PAN" +
      "IC\020\333\375\005\022\037\n\031INTERNAL_UNEXPECTED_SPIRE\020\334\375\005\022" +
      " \n\032INTERNAL_REDIS_UNAVAILABLE\020\335\375\005\022!\n\033INT" +
      "ERNAL_RESOURCE_EXHAUSTED\020\336\375\005\022\"\n\034INTERNAL" +
      "_REDIS_UNCATEGORIZED\020\337\375\005\022 \n\032INTERNAL_AWS" +
      "_UNCATEGORIZED\020\340\375\005\022\"\n\034INTERNAL_AZURE_UNC" +
      "ATEGORIZED\020\341\375\005\022\030\n\022CONN_UNCATEGORIZED\020\271\205\006" +
      "\022\031\n\023MODEL_UNCATEGORIZED\020\272\205\006\022\031\n\023INPUT_UNC" +
      "ATEGORIZED\020\273\205\006\022\036\n\030ANNOTATION_UNCATEGORIZ" +
      "ED\020\274\205\006\022\034\n\026INTERNAL_UNCATEGORIZED\020\301\205\006\022\021\n\013" +
      "BAD_REQUEST\020\240\302\005\022\022\n\014SERVER_ERROR\020\204\303\005B/\n\034c" +
      "om.clarifai.grpc.api.statusP\001Z\006status\242\002\004" +
      "CAIPb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}