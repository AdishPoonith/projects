.class public Lcom/google/crypto/tink/shaded/protobuf/r1;
.super Ljava/util/AbstractList;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/h0;
.implements Ljava/util/RandomAccess;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/util/AbstractList<",
        "Ljava/lang/String;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/h0;",
        "Ljava/util/RandomAccess;"
    }
.end annotation


# instance fields
.field private final j:Lcom/google/crypto/tink/shaded/protobuf/h0;


# direct methods
.method public constructor <init>(Lcom/google/crypto/tink/shaded/protobuf/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    iput-object p1, p0, Lcom/google/crypto/tink/shaded/protobuf/r1;->j:Lcom/google/crypto/tink/shaded/protobuf/h0;

    return-void
.end method

.method static synthetic b(Lcom/google/crypto/tink/shaded/protobuf/r1;)Lcom/google/crypto/tink/shaded/protobuf/h0;
    .locals 0

    iget-object p0, p0, Lcom/google/crypto/tink/shaded/protobuf/r1;->j:Lcom/google/crypto/tink/shaded/protobuf/h0;

    return-object p0
.end method


# virtual methods
.method public d()Lcom/google/crypto/tink/shaded/protobuf/h0;
    .locals 0

    return-object p0
.end method

.method public e(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/r1;->j:Lcom/google/crypto/tink/shaded/protobuf/h0;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public f(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/r1;->j:Lcom/google/crypto/tink/shaded/protobuf/h0;

    invoke-interface {v0, p1}, Lcom/google/crypto/tink/shaded/protobuf/h0;->f(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/r1;->j:Lcom/google/crypto/tink/shaded/protobuf/h0;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/h0;->g()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/r1;->e(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/r1$b;

    invoke-direct {v0, p0}, Lcom/google/crypto/tink/shaded/protobuf/r1$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/r1;)V

    return-object v0
.end method

.method public listIterator(I)Ljava/util/ListIterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ListIterator<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/r1$a;

    invoke-direct {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/r1$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/r1;I)V

    return-object v0
.end method

.method public o(Lcom/google/crypto/tink/shaded/protobuf/i;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/r1;->j:Lcom/google/crypto/tink/shaded/protobuf/h0;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
