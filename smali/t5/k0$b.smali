.class public final Lt5/k0$b;
.super Lcom/google/crypto/tink/shaded/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/k0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/z$a<",
        "Lt5/k0;",
        "Lt5/k0$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lt5/k0;->N()Lt5/k0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Lt5/k0$a;)V
    .locals 0

    invoke-direct {p0}, Lt5/k0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/k0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->v()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    check-cast v0, Lt5/k0;

    invoke-static {v0, p1}, Lt5/k0;->P(Lt5/k0;Lcom/google/crypto/tink/shaded/protobuf/i;)V

    return-object p0
.end method

.method public C(I)Lt5/k0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->v()V

    iget-object v0, p0, Lcom/google/crypto/tink/shaded/protobuf/z$a;->k:Lcom/google/crypto/tink/shaded/protobuf/z;

    check-cast v0, Lt5/k0;

    invoke-static {v0, p1}, Lt5/k0;->O(Lt5/k0;I)V

    return-object p0
.end method
