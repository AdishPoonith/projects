.class Lt8/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq8/g$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt8/a;-><init>(Lt8/a$c;Lq8/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lt8/a;


# direct methods
.method constructor <init>(Lt8/a;)V
    .locals 0

    iput-object p1, p0, Lt8/a$a;->a:Lt8/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lt8/a$a;->a:Lt8/a;

    invoke-static {v0}, Lt8/a;->b(Lt8/a;)Lt8/a$c;

    move-result-object v0

    iget-object v1, p0, Lt8/a$a;->a:Lt8/a;

    invoke-static {v1, p1}, Lt8/a;->a(Lt8/a;Ljava/lang/String;)Landroid/view/PointerIcon;

    move-result-object p1

    invoke-interface {v0, p1}, Lt8/a$c;->setPointerIcon(Landroid/view/PointerIcon;)V

    return-void
.end method
