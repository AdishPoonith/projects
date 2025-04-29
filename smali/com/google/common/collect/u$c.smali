.class final enum Lcom/google/common/collect/u$c;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/common/collect/u$c;",
        ">;",
        "Ljava/util/Iterator<",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lcom/google/common/collect/u$c;

.field private static final synthetic k:[Lcom/google/common/collect/u$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/common/collect/u$c;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/common/collect/u$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/collect/u$c;->j:Lcom/google/common/collect/u$c;

    invoke-static {}, Lcom/google/common/collect/u$c;->g()[Lcom/google/common/collect/u$c;

    move-result-object v0

    sput-object v0, Lcom/google/common/collect/u$c;->k:[Lcom/google/common/collect/u$c;

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

.method private static synthetic g()[Lcom/google/common/collect/u$c;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/common/collect/u$c;

    sget-object v1, Lcom/google/common/collect/u$c;->j:Lcom/google/common/collect/u$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/collect/u$c;
    .locals 1

    const-class v0, Lcom/google/common/collect/u$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/common/collect/u$c;

    return-object p0
.end method

.method public static values()[Lcom/google/common/collect/u$c;
    .locals 1

    sget-object v0, Lcom/google/common/collect/u$c;->k:[Lcom/google/common/collect/u$c;

    invoke-virtual {v0}, [Lcom/google/common/collect/u$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/collect/u$c;

    return-object v0
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/collect/h;->c(Z)V

    return-void
.end method
