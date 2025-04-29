.class Lq8/l$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq8/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic j:Lq8/l;


# direct methods
.method constructor <init>(Lq8/l;)V
    .locals 0

    iput-object p1, p0, Lq8/l$b;->j:Lq8/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 2

    iget-object v0, p1, Lr8/j;->a:Ljava/lang/String;

    iget-object p1, p1, Lr8/j;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "put"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lr8/k$d;->c()V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lq8/l$b;->j:Lq8/l;

    check-cast p1, [B

    invoke-static {v0, p1}, Lq8/l;->b(Lq8/l;[B)[B

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2, p1}, Lr8/k$d;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lq8/l$b;->j:Lq8/l;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lq8/l;->c(Lq8/l;Z)Z

    iget-object p1, p0, Lq8/l$b;->j:Lq8/l;

    invoke-static {p1}, Lq8/l;->d(Lq8/l;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lq8/l$b;->j:Lq8/l;

    iget-boolean v0, p1, Lq8/l;->a:Z

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1, p2}, Lq8/l;->f(Lq8/l;Lr8/k$d;)Lr8/k$d;

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p1, p0, Lq8/l$b;->j:Lq8/l;

    invoke-static {p1}, Lq8/l;->a(Lq8/l;)[B

    move-result-object v0

    invoke-static {p1, v0}, Lq8/l;->e(Lq8/l;[B)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :goto_2
    return-void
.end method
