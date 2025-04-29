.class public final synthetic Lj6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Landroid/app/Activity;

.field public final synthetic k:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lj6/a;->j:Landroid/app/Activity;

    iput-object p2, p0, Lj6/a;->k:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lj6/a;->j:Landroid/app/Activity;

    iget-object v1, p0, Lj6/a;->k:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Lj6/d;->a(Landroid/app/Activity;Ljava/lang/Runnable;)V

    return-void
.end method
