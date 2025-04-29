.class Lh5/i$a;
.super Lo5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/i;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/k<",
        "Lg5/a;",
        "Lt5/e0;",
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

    check-cast p1, Lt5/e0;

    invoke-virtual {p0, p1}, Lh5/i$a;->c(Lt5/e0;)Lg5/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt5/e0;)Lg5/a;
    .locals 1

    invoke-virtual {p1}, Lt5/e0;->Q()Lt5/f0;

    move-result-object p1

    invoke-virtual {p1}, Lt5/f0;->P()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lg5/r;->a(Ljava/lang/String;)Lg5/q;

    move-result-object v0

    invoke-interface {v0, p1}, Lg5/q;->a(Ljava/lang/String;)Lg5/a;

    move-result-object p1

    return-object p1
.end method
