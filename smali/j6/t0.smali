.class public Lj6/t0;
.super Lj6/q;
.source "SourceFile"


# instance fields
.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm6/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lm6/r;Ld7/b0;)V
    .locals 1

    sget-object v0, Lj6/q$b;->t:Lj6/q$b;

    invoke-direct {p0, p1, v0, p2}, Lj6/q;-><init>(Lm6/r;Lj6/q$b;Ld7/b0;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lj6/t0;->d:Ljava/util/List;

    invoke-static {v0, p2}, Lj6/s0;->l(Lj6/q$b;Ld7/b0;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public e(Lm6/i;)Z
    .locals 1

    iget-object v0, p0, Lj6/t0;->d:Ljava/util/List;

    invoke-interface {p1}, Lm6/i;->getKey()Lm6/l;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
