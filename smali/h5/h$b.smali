.class Lh5/h$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/h;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/s;",
        "Lt5/r;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lh5/h;


# direct methods
.method constructor <init>(Lh5/h;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lh5/h$b;->b:Lh5/h;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/s;

    invoke-virtual {p0, p1}, Lh5/h$b;->f(Lt5/s;)Lt5/r;

    move-result-object p1

    return-object p1
.end method

.method public c()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lo5/d$a$a<",
            "Lt5/s;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lo5/d$a$a;

    invoke-static {}, Lt5/s;->O()Lt5/s;

    move-result-object v2

    sget-object v3, Lg5/k$b;->j:Lg5/k$b;

    invoke-direct {v1, v2, v3}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    const-string v2, "CHACHA20_POLY1305"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lo5/d$a$a;

    invoke-static {}, Lt5/s;->O()Lt5/s;

    move-result-object v2

    sget-object v3, Lg5/k$b;->l:Lg5/k$b;

    invoke-direct {v1, v2, v3}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    const-string v2, "CHACHA20_POLY1305_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/h$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/s;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/s;

    invoke-virtual {p0, p1}, Lh5/h$b;->h(Lt5/s;)V

    return-void
.end method

.method public f(Lt5/s;)Lt5/r;
    .locals 1

    invoke-static {}, Lt5/r;->S()Lt5/r$b;

    move-result-object p1

    iget-object v0, p0, Lh5/h$b;->b:Lh5/h;

    invoke-virtual {v0}, Lh5/h;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lt5/r$b;->C(I)Lt5/r$b;

    move-result-object p1

    const/16 v0, 0x20

    invoke-static {v0}, Lu5/p;->c(I)[B

    move-result-object v0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v0

    invoke-virtual {p1, v0}, Lt5/r$b;->B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/r$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/r;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/s;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/s;->P(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/s;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/s;)V
    .locals 0

    return-void
.end method
