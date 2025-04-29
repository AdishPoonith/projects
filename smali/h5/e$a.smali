.class Lh5/e$a;
.super Lo5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/e;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/k<",
        "Lg5/a;",
        "Lt5/i;",
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

    check-cast p1, Lt5/i;

    invoke-virtual {p0, p1}, Lh5/e$a;->c(Lt5/i;)Lg5/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt5/i;)Lg5/a;
    .locals 2

    new-instance v0, Lu5/b;

    invoke-virtual {p1}, Lt5/i;->R()Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/crypto/tink/shaded/protobuf/i;->A()[B

    move-result-object v1

    invoke-virtual {p1}, Lt5/i;->S()Lt5/k;

    move-result-object p1

    invoke-virtual {p1}, Lt5/k;->Q()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lu5/b;-><init>([BI)V

    return-object v0
.end method
