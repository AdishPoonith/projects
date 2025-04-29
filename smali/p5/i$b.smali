.class Lp5/i$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/i;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/w;",
        "Lt5/v;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lp5/i;


# direct methods
.method constructor <init>(Lp5/i;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp5/i$b;->b:Lp5/i;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/w;

    invoke-virtual {p0, p1}, Lp5/i$b;->f(Lt5/w;)Lt5/v;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lo5/d$a$a<",
            "Lt5/w;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lt5/u;->n:Lt5/u;

    sget-object v2, Lg5/k$b;->j:Lg5/k$b;

    const/16 v3, 0x20

    const/16 v4, 0x10

    invoke-static {v3, v4, v1, v2}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v5

    const-string v6, "HMAC_SHA256_128BITTAG"

    invoke-interface {v0, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lg5/k$b;->l:Lg5/k$b;

    invoke-static {v3, v4, v1, v5}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v6

    const-string v7, "HMAC_SHA256_128BITTAG_RAW"

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v3, v1, v2}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v6

    const-string v7, "HMAC_SHA256_256BITTAG"

    invoke-interface {v0, v7, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v3, v3, v1, v5}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v6, "HMAC_SHA256_256BITTAG_RAW"

    invoke-interface {v0, v6, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lt5/u;->o:Lt5/u;

    const/16 v6, 0x40

    invoke-static {v6, v4, v1, v2}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v7

    const-string v8, "HMAC_SHA512_128BITTAG"

    invoke-interface {v0, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v4, v1, v5}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v4

    const-string v7, "HMAC_SHA512_128BITTAG_RAW"

    invoke-interface {v0, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v3, v1, v2}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v4

    const-string v7, "HMAC_SHA512_256BITTAG"

    invoke-interface {v0, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v3, v1, v5}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v3

    const-string v4, "HMAC_SHA512_256BITTAG_RAW"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v6, v1, v2}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v2

    const-string v3, "HMAC_SHA512_512BITTAG"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v6, v6, v1, v5}, Lp5/i;->l(IILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v2, "HMAC_SHA512_512BITTAG_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lp5/i$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/w;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/w;

    invoke-virtual {p0, p1}, Lp5/i$b;->h(Lt5/w;)V

    return-void
.end method

.method public f(Lt5/w;)Lt5/v;
    .locals 2

    invoke-static {}, Lt5/v;->V()Lt5/v$b;

    move-result-object v0

    iget-object v1, p0, Lp5/i$b;->b:Lp5/i;

    invoke-virtual {v1}, Lp5/i;->n()I

    move-result v1

    invoke-virtual {v0, v1}, Lt5/v$b;->D(I)Lt5/v$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/w;->S()Lt5/x;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt5/v$b;->C(Lt5/x;)Lt5/v$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/w;->R()I

    move-result p1

    invoke-static {p1}, Lu5/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt5/v$b;->B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/v$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/v;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/w;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/w;->U(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/w;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/w;)V
    .locals 2

    invoke-virtual {p1}, Lt5/w;->R()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, Lt5/w;->S()Lt5/x;

    move-result-object p1

    invoke-static {p1}, Lp5/i;->k(Lt5/x;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
