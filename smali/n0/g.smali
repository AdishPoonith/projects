.class public final enum Ln0/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ln0/g;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Ln0/g;

.field public static final enum k:Ln0/g;

.field public static final enum l:Ln0/g;

.field public static final enum m:Ln0/g;

.field private static final synthetic n:[Ln0/g;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/g;

    const-string v1, "textRecognition"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ln0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/g;->j:Ln0/g;

    new-instance v0, Ln0/g;

    const-string v1, "notifyStatus"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ln0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/g;->k:Ln0/g;

    new-instance v0, Ln0/g;

    const-string v1, "notifyError"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ln0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/g;->l:Ln0/g;

    new-instance v0, Ln0/g;

    const-string v1, "soundLevelChange"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ln0/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ln0/g;->m:Ln0/g;

    invoke-static {}, Ln0/g;->b()[Ln0/g;

    move-result-object v0

    sput-object v0, Ln0/g;->n:[Ln0/g;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic b()[Ln0/g;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ln0/g;

    sget-object v1, Ln0/g;->j:Ln0/g;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ln0/g;->k:Ln0/g;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ln0/g;->l:Ln0/g;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Ln0/g;->m:Ln0/g;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ln0/g;
    .locals 1

    const-class v0, Ln0/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ln0/g;

    return-object p0
.end method

.method public static values()[Ln0/g;
    .locals 1

    sget-object v0, Ln0/g;->n:[Ln0/g;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ln0/g;

    return-object v0
.end method
