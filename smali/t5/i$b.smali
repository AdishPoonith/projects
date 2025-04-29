.class public final Lt5/i$b;
.super Lcom/google/crypto/tink/shaded/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/z$a<",
        "Lt5/i;",
        "Lt5/i$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lt5/i;->N()Lt5/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Lt5/i$a;)V
    .locals 0

    invoke-direct {p0}, Lt5/i$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->v()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    check-cast v0, Lt5/i;

    invoke-static {v0, p1}, Lt5/i;->Q(Lt5/i;Lcom/google/crypto/tink/shaded/protobuf/i;)V

    return-object p0
.end method

.method public C(Lt5/k;)Lt5/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->v()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    check-cast v0, Lt5/i;

    invoke-static {v0, p1}, Lt5/i;->P(Lt5/i;Lt5/k;)V

    return-object p0
.end method

.method public D(I)Lt5/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->v()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    check-cast v0, Lt5/i;

    invoke-static {v0, p1}, Lt5/i;->O(Lt5/i;I)V

    return-object p0
.end method
