.class final La6/w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/common/api/internal/c$a;


# instance fields
.field final synthetic a:La6/x0;


# direct methods
.method constructor <init>(La6/x0;)V
    .locals 0

    iput-object p1, p0, La6/w0;->a:La6/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Z)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, La6/w0;->a:La6/x0;

    const/4 v0, 0x1

    invoke-static {p1, v0}, La6/x0;->b(La6/x0;Z)V

    iget-object p1, p0, La6/w0;->a:La6/x0;

    invoke-virtual {p1}, La6/x0;->c()V

    return-void

    :cond_0
    iget-object p1, p0, La6/w0;->a:La6/x0;

    const/4 v0, 0x0

    invoke-static {p1, v0}, La6/x0;->b(La6/x0;Z)V

    iget-object p1, p0, La6/w0;->a:La6/x0;

    invoke-static {p1}, La6/x0;->f(La6/x0;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, La6/w0;->a:La6/x0;

    invoke-static {p1}, La6/x0;->a(La6/x0;)La6/p;

    move-result-object p1

    invoke-virtual {p1}, La6/p;->c()V

    :cond_1
    return-void
.end method
