.class Ln3/m$f$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/Spatializer$OnSpatializerStateChangedListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ln3/m$f;->b(Ln3/m;Landroid/os/Looper;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ln3/m;


# direct methods
.method constructor <init>(Ln3/m$f;Ln3/m;)V
    .locals 0

    iput-object p2, p0, Ln3/m$f$a;->a:Ln3/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onSpatializerAvailableChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    iget-object p1, p0, Ln3/m$f$a;->a:Ln3/m;

    invoke-static {p1}, Ln3/m;->x(Ln3/m;)V

    return-void
.end method

.method public onSpatializerEnabledChanged(Landroid/media/Spatializer;Z)V
    .locals 0

    iget-object p1, p0, Ln3/m$f$a;->a:Ln3/m;

    invoke-static {p1}, Ln3/m;->x(Ln3/m;)V

    return-void
.end method
