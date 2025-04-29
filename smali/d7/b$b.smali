.class public final Ld7/b$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Ld7/c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Ld7/b;",
        "Ld7/b$b;",
        ">;",
        "Ld7/c;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ld7/b;->e0()Ld7/b;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Ld7/b$a;)V
    .locals 0

    invoke-direct {p0}, Ld7/b$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ljava/lang/Iterable;)Ld7/b$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ld7/b0;",
            ">;)",
            "Ld7/b$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/b;

    invoke-static {v0, p1}, Ld7/b;->g0(Ld7/b;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public I(Ld7/b0;)Ld7/b$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/b;

    invoke-static {v0, p1}, Ld7/b;->f0(Ld7/b;Ld7/b0;)V

    return-object p0
.end method

.method public J(I)Ld7/b0;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/b;

    invoke-virtual {v0, p1}, Ld7/b;->m0(I)Ld7/b0;

    move-result-object p1

    return-object p1
.end method

.method public K()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/b;

    invoke-virtual {v0}, Ld7/b;->n0()I

    move-result v0

    return v0
.end method

.method public L(I)Ld7/b$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/b;

    invoke-static {v0, p1}, Ld7/b;->h0(Ld7/b;I)V

    return-object p0
.end method

.method public o()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/b;

    invoke-virtual {v0}, Ld7/b;->o()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
