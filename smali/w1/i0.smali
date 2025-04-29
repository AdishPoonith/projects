.class public final synthetic Lw1/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/MediaDrm$OnEventListener;


# instance fields
.field public final synthetic a:Lw1/k0;

.field public final synthetic b:Lw1/g0$b;


# direct methods
.method public synthetic constructor <init>(Lw1/k0;Lw1/g0$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw1/i0;->a:Lw1/k0;

    iput-object p2, p0, Lw1/i0;->b:Lw1/g0$b;

    return-void
.end method


# virtual methods
.method public final onEvent(Landroid/media/MediaDrm;[BII[B)V
    .locals 7

    iget-object v0, p0, Lw1/i0;->a:Lw1/k0;

    iget-object v1, p0, Lw1/i0;->b:Lw1/g0$b;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-static/range {v0 .. v6}, Lw1/k0;->p(Lw1/k0;Lw1/g0$b;Landroid/media/MediaDrm;[BII[B)V

    return-void
.end method
