.class Lh5/g$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/g;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/o;",
        "Lt5/n;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lh5/g;


# direct methods
.method constructor <init>(Lh5/g;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lh5/g$b;->b:Lh5/g;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/o;

    invoke-virtual {p0, p1}, Lh5/g$b;->f(Lt5/o;)Lt5/n;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lo5/d$a$a<",
            "Lt5/o;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lg5/k$b;->j:Lg5/k$b;

    const/16 v2, 0x10

    invoke-static {v2, v1}, Lh5/g;->k(ILg5/k$b;)Lo5/d$a$a;

    move-result-object v3

    const-string v4, "AES128_GCM_SIV"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lg5/k$b;->l:Lg5/k$b;

    invoke-static {v2, v3}, Lh5/g;->k(ILg5/k$b;)Lo5/d$a$a;

    move-result-object v2

    const-string v4, "AES128_GCM_SIV_RAW"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v2, 0x20

    invoke-static {v2, v1}, Lh5/g;->k(ILg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v4, "AES256_GCM_SIV"

    invoke-interface {v0, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v2, v3}, Lh5/g;->k(ILg5/k$b;)Lo5/d$a$a;

    move-result-object v1

    const-string v2, "AES256_GCM_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/g$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/o;

    invoke-virtual {p0, p1}, Lh5/g$b;->h(Lt5/o;)V

    return-void
.end method

.method public f(Lt5/o;)Lt5/n;
    .locals 1

    invoke-static {}, Lt5/n;->S()Lt5/n$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/o;->P()I

    move-result p1

    invoke-static {p1}, Lu5/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt5/n$b;->B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/n$b;

    move-result-object p1

    iget-object v0, p0, Lh5/g$b;->b:Lh5/g;

    invoke-virtual {v0}, Lh5/g;->n()I

    move-result v0

    invoke-virtual {p1, v0}, Lt5/n$b;->C(I)Lt5/n$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/n;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/o;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/o;->R(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/o;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/o;)V
    .locals 0

    invoke-virtual {p1}, Lt5/o;->P()I

    move-result p1

    invoke-static {p1}, Lu5/r;->a(I)V

    return-void
.end method
