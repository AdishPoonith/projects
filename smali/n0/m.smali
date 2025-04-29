.class public final synthetic Ln0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ln0/q;

.field public final synthetic k:F


# direct methods
.method public synthetic constructor <init>(Ln0/q;F)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln0/m;->j:Ln0/q;

    iput p2, p0, Ln0/m;->k:F

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ln0/m;->j:Ln0/q;

    iget v1, p0, Ln0/m;->k:F

    invoke-static {v0, v1}, Ln0/q;->b(Ln0/q;F)V

    return-void
.end method
