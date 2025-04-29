.class Lh5/h$a;
.super Lo5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/h;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/k<",
        "Lg5/a;",
        "Lt5/r;",
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

    check-cast p1, Lt5/r;

    invoke-virtual {p0, p1}, Lh5/h$a;->c(Lt5/r;)Lg5/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt5/r;)Lg5/a;
    .locals 1

    new-instance v0, Lu5/g;

    invoke-virtual {p1}, Lt5/r;->Q()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->A()[B

    move-result-object p1

    invoke-direct {v0, p1}, Lu5/g;-><init>([B)V

    return-object v0
.end method
