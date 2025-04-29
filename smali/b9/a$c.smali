.class public final enum Lb9/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb9/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lb9/a$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lb9/a$c;

.field public static final enum l:Lb9/a$c;

.field public static final enum m:Lb9/a$c;

.field public static final enum n:Lb9/a$c;

.field public static final enum o:Lb9/a$c;

.field public static final enum p:Lb9/a$c;

.field public static final enum q:Lb9/a$c;

.field public static final enum r:Lb9/a$c;

.field public static final enum s:Lb9/a$c;

.field public static final enum t:Lb9/a$c;

.field public static final enum u:Lb9/a$c;

.field private static final synthetic v:[Lb9/a$c;


# instance fields
.field final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lb9/a$c;

    const-string v1, "ROOT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lb9/a$c;->k:Lb9/a$c;

    new-instance v1, Lb9/a$c;

    const-string v3, "MUSIC"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lb9/a$c;->l:Lb9/a$c;

    new-instance v3, Lb9/a$c;

    const-string v5, "PODCASTS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lb9/a$c;->m:Lb9/a$c;

    new-instance v5, Lb9/a$c;

    const-string v7, "RINGTONES"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lb9/a$c;->n:Lb9/a$c;

    new-instance v7, Lb9/a$c;

    const-string v9, "ALARMS"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lb9/a$c;->o:Lb9/a$c;

    new-instance v9, Lb9/a$c;

    const-string v11, "NOTIFICATIONS"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v9, Lb9/a$c;->p:Lb9/a$c;

    new-instance v11, Lb9/a$c;

    const-string v13, "PICTURES"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14, v14}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v11, Lb9/a$c;->q:Lb9/a$c;

    new-instance v13, Lb9/a$c;

    const-string v15, "MOVIES"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14, v14}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v13, Lb9/a$c;->r:Lb9/a$c;

    new-instance v15, Lb9/a$c;

    const-string v14, "DOWNLOADS"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12, v12}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v15, Lb9/a$c;->s:Lb9/a$c;

    new-instance v14, Lb9/a$c;

    const-string v12, "DCIM"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10, v10}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v14, Lb9/a$c;->t:Lb9/a$c;

    new-instance v12, Lb9/a$c;

    const-string v10, "DOCUMENTS"

    const/16 v8, 0xa

    invoke-direct {v12, v10, v8, v8}, Lb9/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v12, Lb9/a$c;->u:Lb9/a$c;

    const/16 v10, 0xb

    new-array v10, v10, [Lb9/a$c;

    aput-object v0, v10, v2

    aput-object v1, v10, v4

    aput-object v3, v10, v6

    const/4 v0, 0x3

    aput-object v5, v10, v0

    const/4 v0, 0x4

    aput-object v7, v10, v0

    const/4 v0, 0x5

    aput-object v9, v10, v0

    const/4 v0, 0x6

    aput-object v11, v10, v0

    const/4 v0, 0x7

    aput-object v13, v10, v0

    const/16 v0, 0x8

    aput-object v15, v10, v0

    const/16 v0, 0x9

    aput-object v14, v10, v0

    aput-object v12, v10, v8

    sput-object v10, Lb9/a$c;->v:[Lb9/a$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lb9/a$c;->j:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lb9/a$c;
    .locals 1

    const-class v0, Lb9/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lb9/a$c;

    return-object p0
.end method

.method public static values()[Lb9/a$c;
    .locals 1

    sget-object v0, Lb9/a$c;->v:[Lb9/a$c;

    invoke-virtual {v0}, [Lb9/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lb9/a$c;

    return-object v0
.end method
