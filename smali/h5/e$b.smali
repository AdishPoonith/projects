.class Lh5/e$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/e;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/j;",
        "Lt5/i;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lh5/e;


# direct methods
.method constructor <init>(Lh5/e;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lh5/e$b;->b:Lh5/e;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/j;

    invoke-virtual {p0, p1}, Lh5/e$b;->f(Lt5/j;)Lt5/i;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lo5/d$a$a<",
            "Lt5/j;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lg5/k$b;->j:Lg5/k$b;

    const/16 v2, 0x10

    invoke-static {v2, v2, v1}, Lh5/e;->k(IILg5/k$b;)Lo5/d$a$a;

    move-result-object v3

    const-string v4, "AES128_EAX"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lg5/k$b;->l:Lg5/k$b;

    invoke-static {v2, v2, v3}, Lh5/e;->k(IILg5/k$b;)Lo5/d$a$a;

    move-result-object v4

    const-string v5, "AES128_EAX_RAW"

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v4, 0x20

    invoke-static {v4, v2, v1}, Lh5/e;->k(IILg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v5, "AES256_EAX"

    invoke-interface {v0, v5, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v4, v2, v3}, Lh5/e;->k(IILg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v2, "AES256_EAX_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/e$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/j;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/j;

    invoke-virtual {p0, p1}, Lh5/e$b;->h(Lt5/j;)V

    return-void
.end method

.method public f(Lt5/j;)Lt5/i;
    .locals 2

    invoke-static {}, Lt5/i;->U()Lt5/i$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/j;->Q()I

    move-result v1

    invoke-static {v1}, Lu5/p;->c(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt5/i$b;->B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/i$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/j;->R()Lt5/k;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt5/i$b;->C(Lt5/k;)Lt5/i$b;

    move-result-object p1

    iget-object v0, p0, Lh5/e$b;->b:Lh5/e;

    invoke-virtual {v0}, Lh5/e;->m()I

    move-result v0

    invoke-virtual {p1, v0}, Lt5/i$b;->D(I)Lt5/i$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/i;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/j;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/j;->T(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/j;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/j;)V
    .locals 2

    invoke-virtual {p1}, Lt5/j;->Q()I

    move-result v0

    invoke-static {v0}, Lu5/r;->a(I)V

    invoke-virtual {p1}, Lt5/j;->R()Lt5/k;

    move-result-object v0

    invoke-virtual {v0}, Lt5/k;->Q()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lt5/j;->R()Lt5/k;

    move-result-object p1

    invoke-virtual {p1}, Lt5/k;->Q()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method
