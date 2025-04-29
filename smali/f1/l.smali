.class public final synthetic Lf1/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Lf1/m;


# direct methods
.method public synthetic constructor <init>(Lf1/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf1/l;->j:Lf1/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lf1/l;->j:Lf1/m;

    invoke-static {v0}, Lf1/m;->E(Lf1/m;)V

    return-void
.end method
