.class Lh5/k$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/k;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/h0;",
        "Lt5/g0;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lh5/k;


# direct methods
.method constructor <init>(Lh5/k;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lh5/k$b;->b:Lh5/k;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/h0;

    invoke-virtual {p0, p1}, Lh5/k$b;->f(Lt5/h0;)Lt5/g0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/k$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/h0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/h0;

    invoke-virtual {p0, p1}, Lh5/k$b;->h(Lt5/h0;)V

    return-void
.end method

.method public f(Lt5/h0;)Lt5/g0;
    .locals 1

    invoke-static {}, Lt5/g0;->S()Lt5/g0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt5/g0$b;->B(Lt5/h0;)Lt5/g0$b;

    move-result-object p1

    iget-object v0, p0, Lh5/k$b;->b:Lh5/k;

    invoke-virtual {v0}, Lh5/k;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lt5/g0$b;->C(I)Lt5/g0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/g0;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/h0;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/h0;->S(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/h0;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/h0;)V
    .locals 1

    invoke-virtual {p1}, Lt5/h0;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lt5/h0;->R()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid key format: missing KEK URI or DEK template"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
