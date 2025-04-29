.class public final synthetic Ll6/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic j:Ll6/i0;

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Ll6/i0;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/a0;->j:Ll6/i0;

    iput p2, p0, Ll6/a0;->k:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ll6/a0;->j:Ll6/i0;

    iget v1, p0, Ll6/a0;->k:I

    invoke-static {v0, v1}, Ll6/i0;->h(Ll6/i0;I)V

    return-void
.end method
