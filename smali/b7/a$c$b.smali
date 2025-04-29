.class public final Lb7/a$c$b;
.super Lcom/google/protobuf/z$a;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb7/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/z$a<",
        "Lb7/a$c;",
        "Lb7/a$c$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lb7/a$c;->e0()Lb7/a$c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/z$a;-><init>(Lcom/google/protobuf/z;)V

    return-void
.end method

.method synthetic constructor <init>(Lb7/a$a;)V
    .locals 0

    invoke-direct {p0}, Lb7/a$c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public H(Lb7/a$c$a;)Lb7/a$c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lb7/a$c;

    invoke-static {v0, p1}, Lb7/a$c;->h0(Lb7/a$c;Lb7/a$c$a;)V

    return-object p0
.end method

.method public I(Ljava/lang/String;)Lb7/a$c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lb7/a$c;

    invoke-static {v0, p1}, Lb7/a$c;->f0(Lb7/a$c;Ljava/lang/String;)V

    return-object p0
.end method

.method public J(Lb7/a$c$c;)Lb7/a$c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/z$a;->z()V

    iget-object v0, p0, Lcom/google/protobuf/z$a;->k:Lcom/google/protobuf/z;

    check-cast v0, Lb7/a$c;

    invoke-static {v0, p1}, Lb7/a$c;->g0(Lb7/a$c;Lb7/a$c$c;)V

    return-object p0
.end method
