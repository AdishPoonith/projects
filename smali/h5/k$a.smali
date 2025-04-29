.class Lh5/k$a;
.super Lo5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/k;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/k<",
        "Lg5/a;",
        "Lt5/g0;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lo5/k;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lcom/google/crypto/tink/shaded/protobuf/s0;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt5/g0;

    invoke-virtual {p0, p1}, Lh5/k$a;->c(Lt5/g0;)Lg5/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt5/g0;)Lg5/a;
    .locals 2

    invoke-virtual {p1}, Lt5/g0;->Q()Lt5/h0;

    move-result-object v0

    invoke-virtual {v0}, Lt5/h0;->Q()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lg5/r;->a(Ljava/lang/String;)Lg5/q;

    move-result-object v1

    invoke-interface {v1, v0}, Lg5/q;->a(Ljava/lang/String;)Lg5/a;

    move-result-object v0

    new-instance v1, Lh5/j;

    invoke-virtual {p1}, Lt5/g0;->Q()Lt5/h0;

    move-result-object p1

    invoke-virtual {p1}, Lt5/h0;->P()Lt5/a0;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lh5/j;-><init>(Lt5/a0;Lg5/a;)V

    return-object v1
.end method
