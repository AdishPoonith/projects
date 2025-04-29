.class public final Lt4/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lb4/d;

.field public static final b:Lb4/d;

.field public static final c:Lb4/d;

.field public static final d:Lb4/d;

.field public static final e:Lb4/d;

.field public static final f:Lb4/d;

.field public static final g:Lb4/d;

.field public static final h:Lb4/d;

.field public static final i:Lb4/d;

.field public static final j:Lb4/d;

.field public static final k:Lb4/d;

.field public static final l:[Lb4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lb4/d;

    const-string v1, "name_ulr_private"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lt4/r;->a:Lb4/d;

    new-instance v1, Lb4/d;

    const-string v4, "name_sleep_segment_request"

    invoke-direct {v1, v4, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lt4/r;->b:Lb4/d;

    new-instance v4, Lb4/d;

    const-string v5, "get_last_activity_feature_id"

    invoke-direct {v4, v5, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lt4/r;->c:Lb4/d;

    new-instance v5, Lb4/d;

    const-string v6, "support_context_feature_id"

    invoke-direct {v5, v6, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lt4/r;->d:Lb4/d;

    new-instance v6, Lb4/d;

    const-string v7, "get_current_location"

    const-wide/16 v8, 0x2

    invoke-direct {v6, v7, v8, v9}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lt4/r;->e:Lb4/d;

    new-instance v7, Lb4/d;

    const-string v8, "get_last_location_with_request"

    invoke-direct {v7, v8, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lt4/r;->f:Lb4/d;

    new-instance v8, Lb4/d;

    const-string v9, "set_mock_mode_with_callback"

    invoke-direct {v8, v9, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lt4/r;->g:Lb4/d;

    new-instance v9, Lb4/d;

    const-string v10, "set_mock_location_with_callback"

    invoke-direct {v9, v10, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v9, Lt4/r;->h:Lb4/d;

    new-instance v10, Lb4/d;

    const-string v11, "inject_location_with_callback"

    invoke-direct {v10, v11, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v10, Lt4/r;->i:Lb4/d;

    new-instance v11, Lb4/d;

    const-string v12, "location_updates_with_callback"

    invoke-direct {v11, v12, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v11, Lt4/r;->j:Lb4/d;

    new-instance v12, Lb4/d;

    const-string v13, "use_safe_parcelable_in_intents"

    invoke-direct {v12, v13, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v12, Lt4/r;->k:Lb4/d;

    const/16 v2, 0xb

    new-array v2, v2, [Lb4/d;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    const/4 v0, 0x1

    aput-object v1, v2, v0

    const/4 v0, 0x2

    aput-object v4, v2, v0

    const/4 v0, 0x3

    aput-object v5, v2, v0

    const/4 v0, 0x4

    aput-object v6, v2, v0

    const/4 v0, 0x5

    aput-object v7, v2, v0

    const/4 v0, 0x6

    aput-object v8, v2, v0

    const/4 v0, 0x7

    aput-object v9, v2, v0

    const/16 v0, 0x8

    aput-object v10, v2, v0

    const/16 v0, 0x9

    aput-object v11, v2, v0

    const/16 v0, 0xa

    aput-object v12, v2, v0

    sput-object v2, Lt4/r;->l:[Lb4/d;

    return-void
.end method
