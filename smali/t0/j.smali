.class public final synthetic Lt0/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lt0/l;

.field public final synthetic k:Ljava/util/TimerTask;


# direct methods
.method public synthetic constructor <init>(Lt0/l;Ljava/util/TimerTask;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/j;->j:Lt0/l;

    iput-object p2, p0, Lt0/j;->k:Ljava/util/TimerTask;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt0/j;->j:Lt0/l;

    iget-object v1, p0, Lt0/j;->k:Ljava/util/TimerTask;

    invoke-static {v0, v1}, Lt0/l;->b(Lt0/l;Ljava/util/TimerTask;)V

    return-void
.end method
