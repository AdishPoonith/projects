.class public abstract Ln6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ln6/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln6/a$a;,
        Ln6/a$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ln6/a;->a:Ljava/util/List;

    return-void
.end method

.method static e(Ld7/b0;)Ld7/b$b;
    .locals 1

    invoke-static {p0}, Lm6/y;->t(Ld7/b0;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Ld7/b0;->q0()Ld7/b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/z;->d0()Lcom/google/protobuf/z$a;

    move-result-object p0

    check-cast p0, Ld7/b$b;

    return-object p0

    :cond_0
    invoke-static {}, Ld7/b;->o0()Ld7/b$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Ld7/b0;)Ld7/b0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Ld7/b0;Lw5/q;)Ld7/b0;
    .locals 0

    invoke-virtual {p0, p1}, Ln6/a;->d(Ld7/b0;)Ld7/b0;

    move-result-object p1

    return-object p1
.end method

.method public c(Ld7/b0;Ld7/b0;)Ld7/b0;
    .locals 0

    invoke-virtual {p0, p1}, Ln6/a;->d(Ld7/b0;)Ld7/b0;

    move-result-object p1

    return-object p1
.end method

.method protected abstract d(Ld7/b0;)Ld7/b0;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ln6/a;

    iget-object v0, p0, Ln6/a;->a:Ljava/util/List;

    iget-object p1, p1, Ln6/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ln6/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ln6/a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
