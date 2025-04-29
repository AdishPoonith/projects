.class Lm5/a$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lm5/a;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/q;",
        "Lt5/p;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lm5/a;


# direct methods
.method constructor <init>(Lm5/a;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lm5/a$b;->b:Lm5/a;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/q;

    invoke-virtual {p0, p1}, Lm5/a$b;->f(Lt5/q;)Lt5/p;

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
            "Lt5/q;",
            ">;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lo5/d$a$a;

    invoke-static {}, Lt5/q;->Q()Lt5/q$b;

    move-result-object v2

    const/16 v3, 0x40

    invoke-virtual {v2, v3}, Lt5/q$b;->B(I)Lt5/q$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v2

    check-cast v2, Lt5/q;

    sget-object v4, Lg5/k$b;->j:Lg5/k$b;

    invoke-direct {v1, v2, v4}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    const-string v2, "AES256_SIV"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lo5/d$a$a;

    invoke-static {}, Lt5/q;->Q()Lt5/q$b;

    move-result-object v2

    invoke-virtual {v2, v3}, Lt5/q$b;->B(I)Lt5/q$b;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object v2

    check-cast v2, Lt5/q;

    sget-object v3, Lg5/k$b;->l:Lg5/k$b;

    invoke-direct {v1, v2, v3}, Lo5/d$a$a;-><init>(Ljava/lang/Object;Lg5/k$b;)V

    const-string v2, "AES256_SIV_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lm5/a$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/q;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/q;

    invoke-virtual {p0, p1}, Lm5/a$b;->h(Lt5/q;)V

    return-void
.end method

.method public f(Lt5/q;)Lt5/p;
    .locals 1

    invoke-static {}, Lt5/p;->S()Lt5/p$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/q;->P()I

    move-result p1

    invoke-static {p1}, Lu5/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt5/p$b;->B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/p$b;

    move-result-object p1

    iget-object v0, p0, Lm5/a$b;->b:Lm5/a;

    invoke-virtual {v0}, Lm5/a;->k()I

    move-result v0

    invoke-virtual {p1, v0}, Lt5/p$b;->C(I)Lt5/p$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/p;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/q;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/q;->R(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/q;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/q;)V
    .locals 4

    invoke-virtual {p1}, Lt5/q;->P()I

    move-result v0

    const/16 v1, 0x40

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "invalid key size: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lt5/q;->P()I

    move-result p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ". Valid keys must have "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " bytes."

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
