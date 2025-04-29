.class public Ln6/a$b;
.super Ln6/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln6/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ld7/b0;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ln6/a;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected d(Ld7/b0;)Ld7/b0;
    .locals 3

    invoke-static {p1}, Ln6/a;->e(Ld7/b0;)Ld7/b$b;

    move-result-object p1

    invoke-virtual {p0}, Ln6/a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld7/b0;

    invoke-static {p1, v1}, Lm6/y;->p(Ld7/c;Ld7/b0;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p1, v1}, Ld7/b$b;->I(Ld7/b0;)Ld7/b$b;

    goto :goto_0

    :cond_1
    invoke-static {}, Ld7/b0;->C0()Ld7/b0$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Ld7/b0$b;->I(Ld7/b$b;)Ld7/b0$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/z$a;->w()Lcom/google/protobuf/z;

    move-result-object p1

    check-cast p1, Ld7/b0;

    return-object p1
.end method
