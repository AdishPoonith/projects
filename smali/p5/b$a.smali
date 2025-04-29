.class Lp5/b$a;
.super Lo5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp5/b;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/k<",
        "Lg5/s;",
        "Lt5/a;",
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

    check-cast p1, Lt5/a;

    invoke-virtual {p0, p1}, Lp5/b$a;->c(Lt5/a;)Lg5/s;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt5/a;)Lg5/s;
    .locals 3

    new-instance v0, Lu5/o;

    new-instance v1, Lu5/m;

    invoke-virtual {p1}, Lt5/a;->R()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/crypto/tink/shaded/protobuf/i;->A()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lu5/m;-><init>([B)V

    invoke-virtual {p1}, Lt5/a;->S()Lt5/c;

    move-result-object p1

    invoke-virtual {p1}, Lt5/c;->Q()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lu5/o;-><init>(Ls5/a;I)V

    return-object v0
.end method
