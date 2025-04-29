.class Lcom/lyokone/location/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/d$d;


# instance fields
.field private a:Lcom/lyokone/location/a;

.field private b:Lr8/d;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lcom/lyokone/location/a;)V
    .locals 0

    iput-object p1, p0, Lcom/lyokone/location/d;->a:Lcom/lyokone/location/a;

    return-void
.end method

.method public b(Ljava/lang/Object;Lr8/d$b;)V
    .locals 1

    iget-object p1, p0, Lcom/lyokone/location/d;->a:Lcom/lyokone/location/a;

    iput-object p2, p1, Lcom/lyokone/location/a;->v:Lr8/d$b;

    iget-object v0, p1, Lcom/lyokone/location/a;->j:Landroid/app/Activity;

    if-nez v0, :cond_0

    const-string p1, "NO_ACTIVITY"

    const/4 v0, 0x0

    invoke-interface {p2, p1, v0, v0}, Lr8/d$b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lcom/lyokone/location/a;->i()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/lyokone/location/d;->a:Lcom/lyokone/location/a;

    invoke-virtual {p1}, Lcom/lyokone/location/a;->r()V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/lyokone/location/d;->a:Lcom/lyokone/location/a;

    invoke-virtual {p1}, Lcom/lyokone/location/a;->w()V

    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    iget-object p1, p0, Lcom/lyokone/location/d;->a:Lcom/lyokone/location/a;

    iget-object v0, p1, Lcom/lyokone/location/a;->k:Lt4/b;

    iget-object p1, p1, Lcom/lyokone/location/a;->o:Lt4/d;

    invoke-interface {v0, p1}, Lt4/b;->e(Lt4/d;)Lcom/google/android/gms/tasks/Task;

    iget-object p1, p0, Lcom/lyokone/location/d;->a:Lcom/lyokone/location/a;

    const/4 v0, 0x0

    iput-object v0, p1, Lcom/lyokone/location/a;->v:Lr8/d$b;

    return-void
.end method

.method d(Lr8/c;)V
    .locals 2

    iget-object v0, p0, Lcom/lyokone/location/d;->b:Lr8/d;

    if-eqz v0, :cond_0

    const-string v0, "StreamHandlerImpl"

    const-string v1, "Setting a method call handler before the last was disposed."

    invoke-static {v0, v1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p0}, Lcom/lyokone/location/d;->e()V

    :cond_0
    new-instance v0, Lr8/d;

    const-string v1, "lyokone/locationstream"

    invoke-direct {v0, p1, v1}, Lr8/d;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/lyokone/location/d;->b:Lr8/d;

    invoke-virtual {v0, p0}, Lr8/d;->d(Lr8/d$d;)V

    return-void
.end method

.method e()V
    .locals 2

    iget-object v0, p0, Lcom/lyokone/location/d;->b:Lr8/d;

    if-nez v0, :cond_0

    const-string v0, "StreamHandlerImpl"

    const-string v1, "Tried to stop listening when no MethodChannel had been initialized."

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lr8/d;->d(Lr8/d$d;)V

    iput-object v1, p0, Lcom/lyokone/location/d;->b:Lr8/d;

    return-void
.end method
