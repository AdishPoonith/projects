.class Lcom/google/common/collect/k0$a;
.super Lcom/google/common/collect/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/common/collect/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/collect/s<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field private final transient l:Lcom/google/common/collect/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/collect/r<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private final transient m:[Ljava/lang/Object;

.field private final transient n:I

.field private final transient o:I


# direct methods
.method constructor <init>(Lcom/google/common/collect/r;[Ljava/lang/Object;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/collect/r<",
            "TK;TV;>;[",
            "Ljava/lang/Object;",
            "II)V"
        }
    .end annotation

    invoke-direct {p0}, Lcom/google/common/collect/s;-><init>()V

    iput-object p1, p0, Lcom/google/common/collect/k0$a;->l:Lcom/google/common/collect/r;

    iput-object p2, p0, Lcom/google/common/collect/k0$a;->m:[Ljava/lang/Object;

    iput p3, p0, Lcom/google/common/collect/k0$a;->n:I

    iput p4, p0, Lcom/google/common/collect/k0$a;->o:I

    return-void
.end method

.method static synthetic D(Lcom/google/common/collect/k0$a;)I
    .locals 0

    iget p0, p0, Lcom/google/common/collect/k0$a;->o:I

    return p0
.end method

.method static synthetic E(Lcom/google/common/collect/k0$a;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lcom/google/common/collect/k0$a;->m:[Ljava/lang/Object;

    return-object p0
.end method

.method static synthetic F(Lcom/google/common/collect/k0$a;)I
    .locals 0

    iget p0, p0, Lcom/google/common/collect/k0$a;->n:I

    return p0
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Lcom/google/common/collect/k0$a;->l:Lcom/google/common/collect/r;

    invoke-virtual {v2, v0}, Lcom/google/common/collect/r;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method e([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/s;->b()Lcom/google/common/collect/q;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/google/common/collect/q;->e([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-virtual {p0}, Lcom/google/common/collect/k0$a;->q()Lcom/google/common/collect/s0;

    move-result-object v0

    return-object v0
.end method

.method p()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public q()Lcom/google/common/collect/s0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/s0<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/common/collect/s;->b()Lcom/google/common/collect/q;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/collect/q;->q()Lcom/google/common/collect/s0;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/common/collect/k0$a;->o:I

    return v0
.end method

.method v()Lcom/google/common/collect/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/collect/q<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/google/common/collect/k0$a$a;

    invoke-direct {v0, p0}, Lcom/google/common/collect/k0$a$a;-><init>(Lcom/google/common/collect/k0$a;)V

    return-object v0
.end method
