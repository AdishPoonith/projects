.class Lh5/c$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/c;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/e;",
        "Lt5/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lh5/c;


# direct methods
.method constructor <init>(Lh5/c;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lh5/c$b;->b:Lh5/c;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/e;

    invoke-virtual {p0, p1}, Lh5/c$b;->f(Lt5/e;)Lt5/d;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lo5/d$a$a<",
            "Lt5/e;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v7, Lt5/u;->n:Lt5/u;

    sget-object v8, Lg5/k$b;->j:Lg5/k$b;

    const/16 v1, 0x10

    const/16 v2, 0x10

    const/16 v3, 0x20

    const/16 v4, 0x10

    move-object v5, v7

    move-object v6, v8

    invoke-static/range {v1 .. v6}, Lh5/c;->k(IIIILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v9, Lg5/k$b;->l:Lg5/k$b;

    const/16 v1, 0x10

    const/16 v2, 0x10

    move-object v6, v9

    invoke-static/range {v1 .. v6}, Lh5/c;->k(IIIILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    const/16 v2, 0x10

    const/16 v4, 0x20

    move-object v6, v8

    invoke-static/range {v1 .. v6}, Lh5/c;->k(IIIILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x20

    const/16 v2, 0x10

    move-object v6, v9

    invoke-static/range {v1 .. v6}, Lh5/c;->k(IIIILt5/u;Lg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/c$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/e;

    invoke-virtual {p0, p1}, Lh5/c$b;->h(Lt5/e;)V

    return-void
.end method

.method public f(Lt5/e;)Lt5/d;
    .locals 2

    new-instance v0, Lh5/d;

    invoke-direct {v0}, Lh5/d;-><init>()V

    invoke-virtual {v0}, Lh5/d;->f()Lo5/d$a;

    move-result-object v0

    invoke-virtual {p1}, Lt5/e;->Q()Lt5/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo5/d$a;->a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object v0

    check-cast v0, Lt5/f;

    new-instance v1, Lp5/i;

    invoke-direct {v1}, Lp5/i;-><init>()V

    invoke-virtual {v1}, Lp5/i;->f()Lo5/d$a;

    move-result-object v1

    invoke-virtual {p1}, Lt5/e;->R()Lt5/w;

    move-result-object p1

    invoke-virtual {v1, p1}, Lo5/d$a;->a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;

    move-result-object p1

    check-cast p1, Lt5/v;

    invoke-static {}, Lt5/d;->U()Lt5/d$b;

    move-result-object v1

    invoke-virtual {v1, v0}, Lt5/d$b;->B(Lt5/f;)Lt5/d$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lt5/d$b;->C(Lt5/v;)Lt5/d$b;

    move-result-object p1

    iget-object v0, p0, Lh5/c$b;->b:Lh5/c;

    invoke-virtual {v0}, Lh5/c;->n()I

    move-result v0

    invoke-virtual {p1, v0}, Lt5/d$b;->D(I)Lt5/d$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/d;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/e;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/e;->T(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/e;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/e;)V
    .locals 2

    new-instance v0, Lh5/d;

    invoke-direct {v0}, Lh5/d;-><init>()V

    invoke-virtual {v0}, Lh5/d;->f()Lo5/d$a;

    move-result-object v0

    invoke-virtual {p1}, Lt5/e;->Q()Lt5/g;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo5/d$a;->e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V

    new-instance v0, Lp5/i;

    invoke-direct {v0}, Lp5/i;-><init>()V

    invoke-virtual {v0}, Lp5/i;->f()Lo5/d$a;

    move-result-object v0

    invoke-virtual {p1}, Lt5/e;->R()Lt5/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo5/d$a;->e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V

    invoke-virtual {p1}, Lt5/e;->Q()Lt5/g;

    move-result-object p1

    invoke-virtual {p1}, Lt5/g;->R()I

    move-result p1

    invoke-static {p1}, Lu5/r;->a(I)V

    return-void
.end method
