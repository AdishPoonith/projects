.class public final synthetic Lu1/b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroid/media/AudioTrack;

.field public final synthetic k:Lp3/g;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;Lp3/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu1/b0;->j:Landroid/media/AudioTrack;

    iput-object p2, p0, Lu1/b0;->k:Lp3/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu1/b0;->j:Landroid/media/AudioTrack;

    iget-object v1, p0, Lu1/b0;->k:Lp3/g;

    invoke-static {v0, v1}, Lu1/c0;->z(Landroid/media/AudioTrack;Lp3/g;)V

    return-void
.end method
