.class final Lu4/t;
.super Lv4/a0;
.source "SourceFile"


# instance fields
.field final synthetic a:Lu4/c$m;


# direct methods
.method constructor <init>(Lu4/c;Lu4/c$m;)V
    .locals 0

    iput-object p2, p0, Lu4/t;->a:Lu4/c$m;

    invoke-direct {p0}, Lv4/a0;-><init>()V

    return-void
.end method


# virtual methods
.method public final a1(Lk4/b;)V
    .locals 1

    iget-object v0, p0, Lu4/t;->a:Lu4/c$m;

    invoke-static {p1}, Lk4/d;->M(Lk4/b;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-interface {v0, p1}, Lu4/c$m;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method

.method public final u1(Landroid/graphics/Bitmap;)V
    .locals 1

    iget-object v0, p0, Lu4/t;->a:Lu4/c$m;

    invoke-interface {v0, p1}, Lu4/c$m;->a(Landroid/graphics/Bitmap;)V

    return-void
.end method
