.class abstract enum Lcom/google/common/collect/y$b;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lb5/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/common/collect/y$b;",
        ">;",
        "Lb5/f<",
        "Ljava/util/Map$Entry<",
        "**>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lcom/google/common/collect/y$b;

.field public static final enum k:Lcom/google/common/collect/y$b;

.field private static final synthetic l:[Lcom/google/common/collect/y$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/common/collect/y$b$a;

    const-string v1, "KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/collect/y$b$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/collect/y$b;->j:Lcom/google/common/collect/y$b;

    new-instance v0, Lcom/google/common/collect/y$b$b;

    const-string v1, "VALUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/common/collect/y$b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/collect/y$b;->k:Lcom/google/common/collect/y$b;

    invoke-static {}, Lcom/google/common/collect/y$b;->b()[Lcom/google/common/collect/y$b;

    move-result-object v0

    sput-object v0, Lcom/google/common/collect/y$b;->l:[Lcom/google/common/collect/y$b;

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

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/common/collect/x;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/google/common/collect/y$b;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic b()[Lcom/google/common/collect/y$b;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/google/common/collect/y$b;

    sget-object v1, Lcom/google/common/collect/y$b;->j:Lcom/google/common/collect/y$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/common/collect/y$b;->k:Lcom/google/common/collect/y$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/collect/y$b;
    .locals 1

    const-class v0, Lcom/google/common/collect/y$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/common/collect/y$b;

    return-object p0
.end method

.method public static values()[Lcom/google/common/collect/y$b;
    .locals 1

    sget-object v0, Lcom/google/common/collect/y$b;->l:[Lcom/google/common/collect/y$b;

    invoke-virtual {v0}, [Lcom/google/common/collect/y$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/collect/y$b;

    return-object v0
.end method
