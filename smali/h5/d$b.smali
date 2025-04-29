.class Lh5/d$b;
.super Lo5/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/d;->f()Lo5/d$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/d$a<",
        "Lt5/g;",
        "Lt5/f;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Lh5/d;


# direct methods
.method constructor <init>(Lh5/d;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lh5/d$b;->b:Lh5/d;

    invoke-direct {p0, p2}, Lo5/d$a;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    check-cast p1, Lt5/g;

    invoke-virtual {p0, p1}, Lh5/d$b;->f(Lt5/g;)Lt5/f;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Lcom/google/crypto/tink/shaded/protobuf/i;)Lcom/google/crypto/tink/shaded/protobuf/s0;
    .locals 0

    invoke-virtual {p0, p1}, Lh5/d$b;->g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/g;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic e(Lcom/google/crypto/tink/shaded/protobuf/s0;)V
    .locals 0

    check-cast p1, Lt5/g;

    invoke-virtual {p0, p1}, Lh5/d$b;->h(Lt5/g;)V

    return-void
.end method

.method public f(Lt5/g;)Lt5/f;
    .locals 2

    invoke-static {}, Lt5/f;->V()Lt5/f$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/g;->S()Lt5/h;

    move-result-object v1

    invoke-virtual {v0, v1}, Lt5/f$b;->C(Lt5/h;)Lt5/f$b;

    move-result-object v0

    invoke-virtual {p1}, Lt5/g;->R()I

    move-result p1

    invoke-static {p1}, Lu5/p;->c(I)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt5/f$b;->B(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/f$b;

    move-result-object p1

    iget-object v0, p0, Lh5/d$b;->b:Lh5/d;

    invoke-virtual {v0}, Lh5/d;->l()I

    move-result v0

    invoke-virtual {p1, v0}, Lt5/f$b;->D(I)Lt5/f$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p1

    check-cast p1, Lt5/f;

    return-object p1
.end method

.method public g(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/g;
    .locals 1

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/q;->b()Lcom/google/crypto/tink/shaded/protobuf/q;

    move-result-object v0

    invoke-static {p1, v0}, Lt5/g;->U(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/g;

    move-result-object p1

    return-object p1
.end method

.method public h(Lt5/g;)V
    .locals 1

    invoke-virtual {p1}, Lt5/g;->R()I

    move-result v0

    invoke-static {v0}, Lu5/r;->a(I)V

    iget-object v0, p0, Lh5/d$b;->b:Lh5/d;

    invoke-virtual {p1}, Lt5/g;->S()Lt5/h;

    move-result-object p1

    invoke-static {v0, p1}, Lh5/d;->k(Lh5/d;Lt5/h;)V

    return-void
.end method
