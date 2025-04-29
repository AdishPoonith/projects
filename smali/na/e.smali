.class public final enum Lna/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lna/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lna/e;

.field public static final enum k:Lna/e;

.field public static final enum l:Lna/e;

.field private static final synthetic m:[Lna/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lna/e;

    const-string v1, "SUSPEND"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lna/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lna/e;->j:Lna/e;

    new-instance v0, Lna/e;

    const-string v1, "DROP_OLDEST"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lna/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lna/e;->k:Lna/e;

    new-instance v0, Lna/e;

    const-string v1, "DROP_LATEST"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lna/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lna/e;->l:Lna/e;

    invoke-static {}, Lna/e;->b()[Lna/e;

    move-result-object v0

    sput-object v0, Lna/e;->m:[Lna/e;

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

.method private static final synthetic b()[Lna/e;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lna/e;

    sget-object v1, Lna/e;->j:Lna/e;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lna/e;->k:Lna/e;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lna/e;->l:Lna/e;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lna/e;
    .locals 1

    const-class v0, Lna/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lna/e;

    return-object p0
.end method

.method public static values()[Lna/e;
    .locals 1

    sget-object v0, Lna/e;->m:[Lna/e;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lna/e;

    return-object v0
.end method
