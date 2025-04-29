.class public final Lt3/e;
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

.field public static final l:Lb4/d;

.field public static final m:[Lb4/d;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lb4/d;

    const-string v1, "account_capability_api"

    const-wide/16 v2, 0x1

    invoke-direct {v0, v1, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v0, Lt3/e;->a:Lb4/d;

    new-instance v1, Lb4/d;

    const-string v4, "account_data_service"

    const-wide/16 v5, 0x6

    invoke-direct {v1, v4, v5, v6}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v1, Lt3/e;->b:Lb4/d;

    new-instance v4, Lb4/d;

    const-string v5, "account_data_service_legacy"

    invoke-direct {v4, v5, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v4, Lt3/e;->c:Lb4/d;

    new-instance v5, Lb4/d;

    const-string v6, "account_data_service_token"

    const-wide/16 v7, 0x8

    invoke-direct {v5, v6, v7, v8}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v5, Lt3/e;->d:Lb4/d;

    new-instance v6, Lb4/d;

    const-string v7, "account_data_service_visibility"

    invoke-direct {v6, v7, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v6, Lt3/e;->e:Lb4/d;

    new-instance v7, Lb4/d;

    const-string v8, "config_sync"

    invoke-direct {v7, v8, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v7, Lt3/e;->f:Lb4/d;

    new-instance v8, Lb4/d;

    const-string v9, "device_account_api"

    invoke-direct {v8, v9, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v8, Lt3/e;->g:Lb4/d;

    new-instance v9, Lb4/d;

    const-string v10, "gaiaid_primary_email_api"

    invoke-direct {v9, v10, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v9, Lt3/e;->h:Lb4/d;

    new-instance v10, Lb4/d;

    const-string v11, "google_auth_service_accounts"

    const-wide/16 v12, 0x2

    invoke-direct {v10, v11, v12, v13}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v10, Lt3/e;->i:Lb4/d;

    new-instance v11, Lb4/d;

    const-string v12, "google_auth_service_token"

    const-wide/16 v13, 0x3

    invoke-direct {v11, v12, v13, v14}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v11, Lt3/e;->j:Lb4/d;

    new-instance v12, Lb4/d;

    const-string v13, "hub_mode_api"

    invoke-direct {v12, v13, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v12, Lt3/e;->k:Lb4/d;

    new-instance v13, Lb4/d;

    const-string v14, "work_account_client_is_whitelisted"

    invoke-direct {v13, v14, v2, v3}, Lb4/d;-><init>(Ljava/lang/String;J)V

    sput-object v13, Lt3/e;->l:Lb4/d;

    const/16 v2, 0xc

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

    const/16 v0, 0xb

    aput-object v13, v2, v0

    sput-object v2, Lt3/e;->m:[Lb4/d;

    return-void
.end method
