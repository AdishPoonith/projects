.class Le9/o$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/c3$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le9/o;->m(Ls1/s;Le9/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Le9/n;

.field final synthetic c:Le9/o;


# direct methods
.method constructor <init>(Le9/o;Le9/n;)V
    .locals 0

    iput-object p1, p0, Le9/o$b;->c:Le9/o;

    iput-object p2, p0, Le9/o$b;->b:Le9/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Le9/o$b;->a:Z

    return-void
.end method


# virtual methods
.method public synthetic A(I)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->o(Ls1/c3$d;I)V

    return-void
.end method

.method public synthetic B(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/e3;->q(Ls1/c3$d;ZI)V

    return-void
.end method

.method public C(Z)V
    .locals 2

    iget-boolean v0, p0, Le9/o$b;->a:Z

    if-eq v0, p1, :cond_1

    iput-boolean p1, p0, Le9/o$b;->a:Z

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-boolean v0, p0, Le9/o$b;->a:Z

    if-eqz v0, :cond_0

    const-string v0, "bufferingStart"

    goto :goto_0

    :cond_0
    const-string v0, "bufferingEnd"

    :goto_0
    const-string v1, "event"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Le9/o$b;->b:Le9/n;

    invoke-virtual {v0, p1}, Le9/n;->a(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method

.method public synthetic D(Z)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->i(Ls1/c3$d;Z)V

    return-void
.end method

.method public synthetic E(I)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->r(Ls1/c3$d;I)V

    return-void
.end method

.method public F(Ls1/y2;)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Le9/o$b;->C(Z)V

    iget-object v0, p0, Le9/o$b;->b:Le9/n;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Video player had error "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    const-string v2, "VideoError"

    invoke-virtual {v0, v2, p1, v1}, Le9/n;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public synthetic K(Z)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->h(Ls1/c3$d;Z)V

    return-void
.end method

.method public synthetic L()V
    .locals 0

    invoke-static {p0}, Ls1/e3;->t(Ls1/c3$d;)V

    return-void
.end method

.method public synthetic M()V
    .locals 0

    invoke-static {p0}, Ls1/e3;->v(Ls1/c3$d;)V

    return-void
.end method

.method public synthetic N(Ls1/d4;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->z(Ls1/c3$d;Ls1/d4;)V

    return-void
.end method

.method public synthetic O(Ls1/c3$b;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->b(Ls1/c3$d;Ls1/c3$b;)V

    return-void
.end method

.method public synthetic R(Ls1/a2;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->k(Ls1/c3$d;Ls1/a2;)V

    return-void
.end method

.method public synthetic S(F)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->B(Ls1/c3$d;F)V

    return-void
.end method

.method public W(I)V
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-ne p1, v1, :cond_0

    invoke-virtual {p0, v0}, Le9/o$b;->C(Z)V

    iget-object v0, p0, Le9/o$b;->c:Le9/o;

    invoke-virtual {v0}, Le9/o;->h()V

    goto :goto_0

    :cond_0
    const/4 v2, 0x3

    if-ne p1, v2, :cond_1

    iget-object v2, p0, Le9/o$b;->c:Le9/o;

    iget-boolean v3, v2, Le9/o;->f:Z

    if-nez v3, :cond_2

    iput-boolean v0, v2, Le9/o;->f:Z

    invoke-virtual {v2}, Le9/o;->i()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v2, "event"

    const-string v3, "completed"

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Le9/o$b;->b:Le9/n;

    invoke-virtual {v2, v0}, Le9/n;->a(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    if-eq p1, v1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Le9/o$b;->C(Z)V

    :cond_3
    return-void
.end method

.method public synthetic X(ZI)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/e3;->m(Ls1/c3$d;ZI)V

    return-void
.end method

.method public synthetic b(Z)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->w(Ls1/c3$d;Z)V

    return-void
.end method

.method public synthetic b0(Ls1/c3$e;Ls1/c3$e;I)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls1/e3;->s(Ls1/c3$d;Ls1/c3$e;Ls1/c3$e;I)V

    return-void
.end method

.method public synthetic d(Ld3/e;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->c(Ls1/c3$d;Ld3/e;)V

    return-void
.end method

.method public synthetic d0(Ls1/y2;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->p(Ls1/c3$d;Ls1/y2;)V

    return-void
.end method

.method public synthetic g0(Ls1/y3;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/e3;->y(Ls1/c3$d;Ls1/y3;I)V

    return-void
.end method

.method public synthetic h0(II)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/e3;->x(Ls1/c3$d;II)V

    return-void
.end method

.method public synthetic i(Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->d(Ls1/c3$d;Ljava/util/List;)V

    return-void
.end method

.method public synthetic i0(Ls1/v1;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/e3;->j(Ls1/c3$d;Ls1/v1;I)V

    return-void
.end method

.method public synthetic j0(Ls1/c3;Ls1/c3$c;)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/e3;->g(Ls1/c3$d;Ls1/c3;Ls1/c3$c;)V

    return-void
.end method

.method public synthetic l(I)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->u(Ls1/c3$d;I)V

    return-void
.end method

.method public synthetic l0(Ls1/o;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->e(Ls1/c3$d;Ls1/o;)V

    return-void
.end method

.method public synthetic n0(Lu1/e;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->a(Ls1/c3$d;Lu1/e;)V

    return-void
.end method

.method public synthetic o(Lq3/z;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->A(Ls1/c3$d;Lq3/z;)V

    return-void
.end method

.method public synthetic o0(IZ)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls1/e3;->f(Ls1/c3$d;IZ)V

    return-void
.end method

.method public synthetic p(Ls1/b3;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->n(Ls1/c3$d;Ls1/b3;)V

    return-void
.end method

.method public p0(Z)V
    .locals 3

    iget-object v0, p0, Le9/o$b;->b:Le9/n;

    if-eqz v0, :cond_0

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "event"

    const-string v2, "isPlayingStateUpdate"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    const-string v1, "isPlaying"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Le9/o$b;->b:Le9/n;

    invoke-virtual {p1, v0}, Le9/n;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public synthetic x(Lk2/a;)V
    .locals 0

    invoke-static {p0, p1}, Ls1/e3;->l(Ls1/c3$d;Lk2/a;)V

    return-void
.end method
