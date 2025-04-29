.class public final Ld7/w$c;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld7/w;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Ld7/w;",
        "Ld7/w$c;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ld7/w;->e0()Ld7/w;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Ld7/w$a;)V
    .locals 0

    invoke-direct {p0}, Ld7/w$c;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Ljava/lang/Iterable;)Ld7/w$c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ld7/w$b;",
            ">;)",
            "Ld7/w$c;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/w;

    invoke-static {v0, p1}, Ld7/w;->g0(Ld7/w;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public I(Ld7/x;)Ld7/w$c;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Ld7/w;

    invoke-static {v0, p1}, Ld7/w;->f0(Ld7/w;Ld7/x;)V

    return-object p0
.end method
