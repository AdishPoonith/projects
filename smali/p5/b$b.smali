.class Lp5/b$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/b;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/b;",
        "Lt5/a;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lp5/b;


# direct methods
.method constructor <init>(Lp5/b;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lp5/b$b;->b:Lp5/b;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/b;

    invoke-virtual {p0, p1}, Lp5/b$b;->f(Lt5/b;)Lt5/a;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lo5/d$a$a<",
            "Lt5/b;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lo5/d$a$a;

    invoke-static {}, Lt5/b;->S()Lt5/b$b;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lt5/b$b;->B(I)Lt5/b$b;

    move-result-object v2

    invoke-static {}, Lt5/c;->R()Lt5/c$b;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lt5/c$b;->B(I)Lt5/c$b;

    move-result-object v4

    invoke-virtual {v4}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v4

    check-cast v4, Lt5/c;

    invoke-virtual {v2, v4}, Lt5/b$b;->C(Lt5/c;)Lt5/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v2

    check-cast v2, Lt5/b;

    sget-object v4, Lg5/k$b;->j:Lg5/k$b;

    invoke-direct {v1, v2, v4}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lo5/d$a$a;

    invoke-static {}, Lt5/b;->S()Lt5/b$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lt5/b$b;->B(I)Lt5/b$b;

    move-result-object v2

    invoke-static {}, Lt5/c;->R()Lt5/c$b;

    move-result-object v6

    invoke-virtual {v6, v5}, Lt5/c$b;->B(I)Lt5/c$b;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v6

    check-cast v6, Lt5/c;

    invoke-virtual {v2, v6}, Lt5/b$b;->C(Lt5/c;)Lt5/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v2

    check-cast v2, Lt5/b;

    invoke-direct {v1, v2, v4}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lo5/d$a$a;

    invoke-static {}, Lt5/b;->S()Lt5/b$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lt5/b$b;->B(I)Lt5/b$b;

    move-result-object v2

    invoke-static {}, Lt5/c;->R()Lt5/c$b;

    move-result-object v3

    invoke-virtual {v3, v5}, Lt5/c$b;->B(I)Lt5/c$b;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v3

    check-cast v3, Lt5/c;

    invoke-virtual {v2, v3}, Lt5/b$b;->C(Lt5/c;)Lt5/b$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v2

    check-cast v2, Lt5/b;

    sget-object v3, Lg5/k$b;->l:Lg5/k$b;

    invoke-direct {v1, v2, v3}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    const-string v2, "AES256_CMAC_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lp5/b$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/b;

    invoke-virtual {p0, p1}, Lp5/b$b;->h(Lt5/b;)V

    return-void
.end method

.method public f(Lt5/b;)Lt5/a;
    .locals 2

    invoke-static {}, Lt5/a;->U()Lt5/a$b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lt5/a$b;->D(I)Lt5/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/b;->Q()I

    move-result v1

    invoke-static {v1}, Lu5/p;->c(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt5/a$b;->B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/b;->R()Lt5/c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt5/a$b;->C(Lt5/c;)Lt5/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/a;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/b;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/b;->T(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/b;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/b;)V
    .locals 1

    invoke-virtual {p1}, Lt5/b;->R()Lt5/c;

    move-result-object v0

    invoke-static {v0}, Lp5/b;->k(Lt5/c;)V

    invoke-virtual {p1}, Lt5/b;->Q()I

    move-result p1

    invoke-static {p1}, Lp5/b;->l(I)V

    return-void
.end method
