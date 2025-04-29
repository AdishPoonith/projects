.class Lh5/c$a;
.super Lo5/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh5/c;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo5/k<",
        "Lg5/a;",
        "Lt5/d;",
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

    check-cast p1, Lt5/d;

    invoke-virtual {p0, p1}, Lh5/c$a;->c(Lt5/d;)Lg5/a;

    move-result-object p1

    return-object p1
.end method

.method public c(Lt5/d;)Lg5/a;
    .locals 5

    new-instance v0, Lu5/h;

    new-instance v1, Lh5/d;

    invoke-direct {v1}, Lh5/d;-><init>()V

    invoke-virtual {p1}, Lt5/d;->R()Lt5/f;

    move-result-object v2

    const-class v3, Lu5/l;

    invoke-virtual {v1, v2, v3}, Lo5/d;->e(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lu5/l;

    new-instance v2, Lp5/i;

    invoke-direct {v2}, Lp5/i;-><init>()V

    invoke-virtual {p1}, Lt5/d;->S()Lt5/v;

    move-result-object v3

    const-class v4, Lg5/s;

    invoke-virtual {v2, v3, v4}, Lo5/d;->e(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg5/s;

    invoke-virtual {p1}, Lt5/d;->S()Lt5/v;

    move-result-object p1

    invoke-virtual {p1}, Lt5/v;->T()Lt5/x;

    move-result-object p1

    invoke-virtual {p1}, Lt5/x;->S()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lu5/h;-><init>(Lu5/l;Lg5/s;I)V

    return-object v0
.end method
