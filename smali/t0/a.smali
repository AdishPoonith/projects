.class public final synthetic Lt0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Landroid/os/Bundle;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt0/a;->j:Ljava/lang/String;

    iput-object p2, p0, Lt0/a;->k:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lt0/a;->j:Ljava/lang/String;

    iget-object v1, p0, Lt0/a;->k:Landroid/os/Bundle;

    invoke-static {v0, v1}, Lt0/b;->a(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
