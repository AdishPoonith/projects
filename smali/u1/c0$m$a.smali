.class Lu1/c0$m$a;
.super Landroid/media/AudioTrack$StreamEventCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lu1/c0$m;-><init>(Lu1/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lu1/c0;

.field final synthetic b:Lu1/c0$m;


# direct methods
.method constructor <init>(Lu1/c0$m;Lu1/c0;)V
    .locals 0

    iput-object p1, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iput-object p2, p0, Lu1/c0$m$a;->a:Lu1/c0;

    invoke-direct {p0}, Landroid/media/AudioTrack$StreamEventCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDataRequest(Landroid/media/AudioTrack;I)V
    .locals 0

    iget-object p2, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iget-object p2, p2, Lu1/c0$m;->c:Lu1/c0;

    invoke-static {p2}, Lu1/c0;->F(Lu1/c0;)Landroid/media/AudioTrack;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iget-object p1, p1, Lu1/c0$m;->c:Lu1/c0;

    invoke-static {p1}, Lu1/c0;->G(Lu1/c0;)Lu1/v$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iget-object p1, p1, Lu1/c0$m;->c:Lu1/c0;

    invoke-static {p1}, Lu1/c0;->A(Lu1/c0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iget-object p1, p1, Lu1/c0$m;->c:Lu1/c0;

    invoke-static {p1}, Lu1/c0;->G(Lu1/c0;)Lu1/v$c;

    move-result-object p1

    invoke-interface {p1}, Lu1/v$c;->f()V

    :cond_1
    return-void
.end method

.method public onTearDown(Landroid/media/AudioTrack;)V
    .locals 1

    iget-object v0, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iget-object v0, v0, Lu1/c0$m;->c:Lu1/c0;

    invoke-static {v0}, Lu1/c0;->F(Lu1/c0;)Landroid/media/AudioTrack;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iget-object p1, p1, Lu1/c0$m;->c:Lu1/c0;

    invoke-static {p1}, Lu1/c0;->G(Lu1/c0;)Lu1/v$c;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iget-object p1, p1, Lu1/c0$m;->c:Lu1/c0;

    invoke-static {p1}, Lu1/c0;->A(Lu1/c0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lu1/c0$m$a;->b:Lu1/c0$m;

    iget-object p1, p1, Lu1/c0$m;->c:Lu1/c0;

    invoke-static {p1}, Lu1/c0;->G(Lu1/c0;)Lu1/v$c;

    move-result-object p1

    invoke-interface {p1}, Lu1/v$c;->f()V

    :cond_1
    return-void
.end method
