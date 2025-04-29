.class Ld3/g$a;
.super Ld3/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld3/g;->y()Ld3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic o:Ld3/g;


# direct methods
.method constructor <init>(Ld3/g;)V
    .locals 0

    iput-object p1, p0, Ld3/g$a;->o:Ld3/g;

    invoke-direct {p0}, Ld3/m;-><init>()V

    return-void
.end method


# virtual methods
.method public w()V
    .locals 1

    iget-object v0, p0, Ld3/g$a;->o:Ld3/g;

    invoke-static {v0, p0}, Ld3/g;->w(Ld3/g;Lv1/h;)V

    return-void
.end method
